.class final Lcom/kik/cards/web/auth/d;
.super Lkik/android/util/bf;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/auth/a;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/a;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/kik/cards/web/auth/d;->a:Lcom/kik/cards/web/auth/a;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/lang/Void;
    .locals 2

    .prologue
    .line 202
    invoke-static {}, Lcom/kik/cards/web/auth/l;->a()Ljava/security/KeyPair;

    move-result-object v0

    .line 204
    :try_start_0
    iget-object v1, p0, Lcom/kik/cards/web/auth/d;->a:Lcom/kik/cards/web/auth/a;

    invoke-static {v1, v0}, Lcom/kik/cards/web/auth/a;->a(Lcom/kik/cards/web/auth/a;Ljava/security/KeyPair;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 212
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 206
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/security/GeneralSecurityException;->printStackTrace()V

    goto :goto_0

    .line 209
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 198
    invoke-direct {p0}, Lcom/kik/cards/web/auth/d;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 198
    check-cast p1, Ljava/lang/Void;

    invoke-super {p0, p1}, Lkik/android/util/bf;->onPostExecute(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/kik/cards/web/auth/d;->a:Lcom/kik/cards/web/auth/a;

    invoke-static {v0}, Lcom/kik/cards/web/auth/a;->c(Lcom/kik/cards/web/auth/a;)Z

    iget-object v0, p0, Lcom/kik/cards/web/auth/d;->a:Lcom/kik/cards/web/auth/a;

    invoke-static {v0}, Lcom/kik/cards/web/auth/a;->d(Lcom/kik/cards/web/auth/a;)V

    return-void
.end method
