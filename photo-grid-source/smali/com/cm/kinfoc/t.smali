.class final Lcom/cm/kinfoc/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cm/kinfoc/a/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/cm/kinfoc/a/d",
        "<",
        "Lcom/cm/kinfoc/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/x;

.field final synthetic b:Lcom/cm/kinfoc/s;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/s;Lcom/cm/kinfoc/x;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/cm/kinfoc/t;->b:Lcom/cm/kinfoc/s;

    iput-object p2, p0, Lcom/cm/kinfoc/t;->a:Lcom/cm/kinfoc/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 34
    check-cast p1, Lcom/cm/kinfoc/f;

    .line 1037
    if-eqz p1, :cond_0

    .line 1038
    invoke-static {}, Lcom/cm/kinfoc/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1039
    iget-object v0, p0, Lcom/cm/kinfoc/t;->a:Lcom/cm/kinfoc/x;

    if-eqz v0, :cond_0

    .line 1040
    invoke-static {}, Lcom/cm/kinfoc/q;->a()Lcom/cm/kinfoc/q;

    move-result-object v1

    .line 1233
    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 1234
    iget v0, p1, Lcom/cm/kinfoc/f;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1251
    :cond_0
    :goto_0
    return-void

    .line 1236
    :pswitch_0
    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1237
    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/cm/kinfoc/v;

    iget-object v2, v0, Lcom/cm/kinfoc/v;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/cm/kinfoc/v;

    iget-object v0, v0, Lcom/cm/kinfoc/v;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/q;->a(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    .line 1244
    :pswitch_1
    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1245
    invoke-static {}, Lcom/cm/kinfoc/q;->f()Z

    goto :goto_0

    .line 1250
    :pswitch_2
    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1251
    invoke-static {}, Lcom/cm/kinfoc/q;->e()Z

    goto :goto_0

    .line 1255
    :pswitch_3
    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1256
    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/cm/kinfoc/v;

    iget-object v2, v0, Lcom/cm/kinfoc/v;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/cm/kinfoc/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/cm/kinfoc/v;

    iget-object v0, v0, Lcom/cm/kinfoc/v;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/q;->b(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    .line 1234
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
