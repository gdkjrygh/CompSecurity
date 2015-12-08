.class final Lkik/android/widget/ds;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lkik/android/widget/dl;


# direct methods
.method constructor <init>(Lkik/android/widget/dl;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 476
    iput-object p1, p0, Lkik/android/widget/ds;->b:Lkik/android/widget/dl;

    iput-object p2, p0, Lkik/android/widget/ds;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 480
    iget-object v0, p0, Lkik/android/widget/ds;->a:Landroid/view/View;

    invoke-static {v0}, Lkik/android/util/cv;->a(Landroid/view/View;)V

    .line 481
    iget-object v0, p0, Lkik/android/widget/ds;->b:Lkik/android/widget/dl;

    invoke-static {v0, p1}, Lkik/android/widget/dl;->a(Lkik/android/widget/dl;Landroid/view/View;)V

    .line 482
    const/4 v0, 0x1

    return v0
.end method
