.class final Lkik/android/widget/bz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/k;

.field final synthetic b:Lkik/android/widget/KikContactImageThumbNailList;


# direct methods
.method constructor <init>(Lkik/android/widget/KikContactImageThumbNailList;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lkik/android/widget/bz;->b:Lkik/android/widget/KikContactImageThumbNailList;

    iput-object p2, p0, Lkik/android/widget/bz;->a:Lkik/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lkik/android/widget/bz;->b:Lkik/android/widget/KikContactImageThumbNailList;

    invoke-static {v0}, Lkik/android/widget/KikContactImageThumbNailList;->a(Lkik/android/widget/KikContactImageThumbNailList;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/bz;->a:Lkik/a/d/k;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 145
    return-void
.end method
