.class Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;
.super Landroid/os/AsyncTask;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Integer;",
        "Lcom/qihoo/security/leak/c;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

.field private b:Lcom/qihoo/security/dialog/g;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$1;)V
    .locals 0

    .prologue
    .line 180
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;-><init>(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 8

    .prologue
    const-wide/16 v6, 0x320

    const-wide/16 v0, 0x0

    .line 186
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)Lcom/qihoo/security/leak/c;

    move-result-object v2

    if-nez v2, :cond_0

    .line 187
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 203
    :goto_0
    return-object v0

    .line 189
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 190
    iget-object v4, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-static {v4}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)Lcom/qihoo/security/leak/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qihoo/security/leak/c;->f()Z

    .line 191
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 192
    sub-long v2, v4, v2

    .line 193
    cmp-long v4, v2, v0

    if-gez v4, :cond_2

    .line 197
    :goto_1
    cmp-long v2, v0, v6

    if-gez v2, :cond_1

    .line 199
    sub-long v0, v6, v0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)Lcom/qihoo/security/leak/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/leak/c;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 200
    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    move-wide v0, v2

    goto :goto_1
.end method

.method protected a(Ljava/lang/Boolean;)V
    .locals 2

    .prologue
    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 220
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0139

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->b(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;)V

    .line 222
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;)Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;

    .line 223
    return-void
.end method

.method protected varargs a([Lcom/qihoo/security/leak/c;)V
    .locals 0

    .prologue
    .line 228
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 180
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a([Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onCancelled()V
    .locals 0

    .prologue
    .line 232
    invoke-super {p0}, Landroid/os/AsyncTask;->onCancelled()V

    .line 233
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 180
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    if-nez v0, :cond_0

    .line 209
    new-instance v0, Lcom/qihoo/security/dialog/g;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a:Lcom/qihoo/security/ui/antivirus/LeakDetailActivity;

    invoke-direct {v0, v1}, Lcom/qihoo/security/dialog/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    const v1, 0x7f0c00b7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/g;->a(I)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/dialog/g;->setCancelable(Z)V

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/dialog/g;->setCanceledOnTouchOutside(Z)V

    .line 214
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->b:Lcom/qihoo/security/dialog/g;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->a(Landroid/app/Dialog;)V

    .line 215
    return-void
.end method

.method protected synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 180
    check-cast p1, [Lcom/qihoo/security/leak/c;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/antivirus/LeakDetailActivity$a;->a([Lcom/qihoo/security/leak/c;)V

    return-void
.end method
