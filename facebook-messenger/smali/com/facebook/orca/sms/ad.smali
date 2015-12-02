.class Lcom/facebook/orca/sms/ad;
.super Ljava/lang/Object;
.source "MmsSmsLogExternalMessagesBackgroundTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/backgroundtasks/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/sms/ac;


# direct methods
.method constructor <init>(Lcom/facebook/orca/sms/ac;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/backgroundtasks/b;
    .locals 4

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/ac;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/ac;->k()Lcom/facebook/orca/sms/ae;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v1}, Lcom/facebook/orca/sms/ac;->a(Lcom/facebook/orca/sms/ac;)Lcom/facebook/orca/sms/af;

    move-result-object v1

    iget v2, v0, Lcom/facebook/orca/sms/ae;->b:I

    invoke-virtual {v1, v2}, Lcom/facebook/orca/sms/af;->a(I)V

    .line 76
    iget-object v1, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v1}, Lcom/facebook/orca/sms/ac;->a(Lcom/facebook/orca/sms/ac;)Lcom/facebook/orca/sms/af;

    move-result-object v1

    iget v2, v0, Lcom/facebook/orca/sms/ae;->a:I

    invoke-virtual {v1, v2}, Lcom/facebook/orca/sms/af;->b(I)V

    .line 77
    iget-object v1, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v1}, Lcom/facebook/orca/sms/ac;->a(Lcom/facebook/orca/sms/ac;)Lcom/facebook/orca/sms/af;

    move-result-object v1

    iget v2, v0, Lcom/facebook/orca/sms/ae;->d:I

    invoke-virtual {v1, v2}, Lcom/facebook/orca/sms/af;->c(I)V

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v1}, Lcom/facebook/orca/sms/ac;->a(Lcom/facebook/orca/sms/ac;)Lcom/facebook/orca/sms/af;

    move-result-object v1

    iget v0, v0, Lcom/facebook/orca/sms/ae;->c:I

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/af;->d(I)V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v0}, Lcom/facebook/orca/sms/ac;->a(Lcom/facebook/orca/sms/ac;)Lcom/facebook/orca/sms/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/sms/af;->b()V

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v0}, Lcom/facebook/orca/sms/ac;->b(Lcom/facebook/orca/sms/ac;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 85
    sget-object v1, Lcom/facebook/orca/prefs/n;->k:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/sms/ad;->a:Lcom/facebook/orca/sms/ac;

    invoke-static {v2}, Lcom/facebook/orca/sms/ac;->c(Lcom/facebook/orca/sms/ac;)Lcom/facebook/common/time/a;

    move-result-object v2

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 86
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 88
    :cond_0
    new-instance v0, Lcom/facebook/backgroundtasks/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/backgroundtasks/b;-><init>(Z)V

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 70
    invoke-virtual {p0}, Lcom/facebook/orca/sms/ad;->a()Lcom/facebook/backgroundtasks/b;

    move-result-object v0

    return-object v0
.end method
