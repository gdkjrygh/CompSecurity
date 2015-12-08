.class final Lkik/android/chat/fragment/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/k;

.field final synthetic b:Lkik/android/chat/fragment/at;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/at;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lkik/android/chat/fragment/aw;->b:Lkik/android/chat/fragment/at;

    iput-object p2, p0, Lkik/android/chat/fragment/aw;->a:Lkik/a/d/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 262
    iget-object v0, p0, Lkik/android/chat/fragment/aw;->b:Lkik/android/chat/fragment/at;

    invoke-static {v0}, Lkik/android/chat/fragment/at;->a(Lkik/android/chat/fragment/at;)Lkik/android/util/ao;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/aw;->a:Lkik/a/d/k;

    invoke-interface {v0, v1}, Lkik/android/util/ao;->a(Lkik/a/d/k;)V

    .line 263
    return-void
.end method
