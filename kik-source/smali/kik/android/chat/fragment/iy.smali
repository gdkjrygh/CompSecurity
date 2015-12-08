.class final Lkik/android/chat/fragment/iy;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/d/n;

.field final synthetic b:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V
    .locals 0

    .prologue
    .line 383
    iput-object p1, p0, Lkik/android/chat/fragment/iy;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/iy;->a:Lkik/a/d/n;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 383
    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/iy;->a:Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->a()Lkik/a/d/j;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/iy;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->i:Lkik/a/e/l;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/iy;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Lkik/a/d/n;)V

    :cond_0
    return-void
.end method
