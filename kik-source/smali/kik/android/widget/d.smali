.class final Lkik/android/widget/d;
.super Landroid/graphics/Paint;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/c;


# direct methods
.method constructor <init>(Lkik/android/widget/c;)V
    .locals 1

    .prologue
    .line 40
    iput-object p1, p0, Lkik/android/widget/d;->a:Lkik/android/widget/c;

    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 42
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/widget/d;->setAntiAlias(Z)V

    .line 43
    const v0, -0x777778

    invoke-virtual {p0, v0}, Lkik/android/widget/d;->setColor(I)V

    .line 44
    return-void
.end method
