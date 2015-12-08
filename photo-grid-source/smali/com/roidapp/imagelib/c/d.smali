.class final Lcom/roidapp/imagelib/c/d;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/roidapp/imagelib/c/c;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/c/c;)V
    .locals 0

    .prologue
    .line 153
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 154
    iput-object p1, p0, Lcom/roidapp/imagelib/c/d;->a:Lcom/roidapp/imagelib/c/c;

    .line 155
    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    .line 2159
    iget-object v0, p0, Lcom/roidapp/imagelib/c/d;->a:Lcom/roidapp/imagelib/c/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    .line 2160
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/c/d;->a:Lcom/roidapp/imagelib/c/c;

    invoke-interface {v0}, Lcom/roidapp/imagelib/c/c;->b()V

    .line 2161
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 150
    .line 1166
    iget-object v0, p0, Lcom/roidapp/imagelib/c/d;->a:Lcom/roidapp/imagelib/c/c;

    if-eqz v0, :cond_0

    .line 1167
    iget-object v0, p0, Lcom/roidapp/imagelib/c/d;->a:Lcom/roidapp/imagelib/c/c;

    invoke-interface {v0}, Lcom/roidapp/imagelib/c/c;->a()V

    .line 150
    :cond_0
    return-void
.end method
