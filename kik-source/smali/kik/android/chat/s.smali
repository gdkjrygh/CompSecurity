.class final Lkik/android/chat/s;
.super Lkik/android/d/l;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/e/o;

.field final synthetic b:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runnable;Lkik/android/util/ar;Lkik/a/e/o;)V
    .locals 7

    .prologue
    .line 1062
    iput-object p1, p0, Lkik/android/chat/s;->b:Lkik/android/chat/KikApplication;

    iput-object p8, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lkik/android/d/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1062
    check-cast p1, Ljava/lang/String;

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/16 v1, 0x80

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    const-string v2, "none"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v0, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    invoke-interface {v0, v3}, Lkik/a/e/o;->b([B)V

    iget-object v0, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    invoke-interface {v0, v3}, Lkik/a/e/o;->a([B)V

    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v2, "corrupt public"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    invoke-interface {v0, v1}, Lkik/a/e/o;->b([B)V

    goto :goto_0

    :cond_2
    const-string v2, "corrupt public private"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    invoke-interface {v2, v1}, Lkik/a/e/o;->b([B)V

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v0, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    invoke-interface {v0, v1}, Lkik/a/e/o;->a([B)V

    goto :goto_0

    :cond_3
    const-string v0, "corrupt private"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/s;->a:Lkik/a/e/o;

    invoke-interface {v0, v1}, Lkik/a/e/o;->a([B)V

    goto :goto_0
.end method
