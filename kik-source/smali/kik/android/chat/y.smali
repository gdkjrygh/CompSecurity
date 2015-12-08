.class final Lkik/android/chat/y;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 260
    iput-object p1, p0, Lkik/android/chat/y;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 260
    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/y;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;

    move-result-object v0

    invoke-interface {v0, p2}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/y;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->b(Lkik/android/chat/KikApplication;)Lkik/a/e/r;

    move-result-object v0

    invoke-virtual {v1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/y;->a:Lkik/android/chat/KikApplication;

    iget-object v2, v2, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Unmuted"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Verified"

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Source"

    const-string v4, "Expired"

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Duration"

    invoke-virtual {v1}, Lkik/a/d/f;->p()J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v1, v4, v6

    if-nez v1, :cond_0

    const-string v1, "Forever"

    :goto_0
    invoke-virtual {v2, v3, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Group"

    instance-of v3, v0, Lkik/a/d/n;

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Participants Count"

    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_1

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    :goto_1
    invoke-virtual {v2, v3, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    return-void

    :cond_0
    const-string v1, "Limited Time Duration"

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1

    goto :goto_1
.end method
