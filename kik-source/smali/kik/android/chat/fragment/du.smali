.class final Lkik/android/chat/fragment/du;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lkik/a/d/a/a;

.field final synthetic d:Lkik/a/d/a/a;

.field final synthetic e:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;[BLkik/a/d/s;Lkik/a/d/a/a;Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 2479
    iput-object p1, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/du;->a:[B

    iput-object p3, p0, Lkik/android/chat/fragment/du;->b:Lkik/a/d/s;

    iput-object p4, p0, Lkik/android/chat/fragment/du;->c:Lkik/a/d/a/a;

    iput-object p5, p0, Lkik/android/chat/fragment/du;->d:Lkik/a/d/a/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 2479
    check-cast p1, Lcom/kik/m/o;

    iget-object v0, p1, Lcom/kik/m/o;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p1, Lcom/kik/m/o;->a:Ljava/lang/Object;

    check-cast v1, Ljava/security/KeyPair;

    invoke-static {v0, v1}, Lkik/a/f/f/v;->a(Ljava/util/List;Ljava/security/KeyPair;)Z

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/du;->a:[B

    if-nez v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/du;->a:[B

    if-eqz v1, :cond_6

    if-nez v0, :cond_6

    :cond_1
    invoke-static {}, Lkik/android/chat/fragment/KikChatFragment;->q()Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/du;->b:Lkik/a/d/s;

    invoke-virtual {v0, v5}, Lkik/a/d/s;->a([B)V

    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/du;->c:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.kik.ext.video-gallery"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/chat/fragment/du;->c:Lkik/a/d/a/a;

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.kik.ext.video-camera"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->n:Lcom/kik/l/ab;

    iget-object v1, p0, Lkik/android/chat/fragment/du;->c:Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/chat/fragment/du;->a:[B

    iget-object v3, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    invoke-interface {v0, v1, v2, v5, v3}, Lcom/kik/l/ab;->a(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/dv;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/dv;-><init>(Lkik/android/chat/fragment/du;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :goto_0
    return-void

    :cond_4
    iget-object v0, p0, Lkik/android/chat/fragment/du;->d:Lkik/a/d/a/a;

    iget-object v1, p0, Lkik/android/chat/fragment/du;->a:[B

    iget-object v2, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    iget-object v3, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikChatFragment;->i:Lkik/a/f/k;

    iget-object v4, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/KikChatFragment;->d:Lkik/a/e/v;

    invoke-static {v4}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/z;)Lcom/kik/cache/z;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikChatFragment;->b:Lcom/kik/cache/ad;

    new-instance v2, Lkik/android/chat/fragment/dw;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/dw;-><init>(Lkik/android/chat/fragment/du;)V

    invoke-virtual {v1, v0, v2}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;)Lcom/kik/cache/ad$c;

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0, v5}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    invoke-virtual {v0, v5}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 2596
    iget-object v0, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/du;->e:Lkik/android/chat/fragment/KikChatFragment;

    const v2, 0x7f090134

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->e(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;)V

    .line 2597
    return-void
.end method
