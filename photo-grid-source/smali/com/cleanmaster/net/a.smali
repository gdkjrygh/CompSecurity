.class public Lcom/cleanmaster/net/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/cleanmaster/net/ResponseCode;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->DEFAULT:Lcom/cleanmaster/net/ResponseCode;

    iput-object v0, p0, Lcom/cleanmaster/net/a;->a:Lcom/cleanmaster/net/ResponseCode;

    return-void
.end method


# virtual methods
.method public a(Lcom/cleanmaster/net/ResponseCode;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/cleanmaster/net/a;->a:Lcom/cleanmaster/net/ResponseCode;

    .line 110
    return-void
.end method

.method public a(Lorg/apache/http/HttpResponse;)V
    .locals 1

    .prologue
    .line 212
    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    .line 213
    sparse-switch v0, :sswitch_data_0

    .line 236
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->Failed:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    .line 239
    :goto_0
    return-void

    .line 215
    :sswitch_0
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->Succeed:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 218
    :sswitch_1
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->BadRequest:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 221
    :sswitch_2
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->UnAuthorized:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 224
    :sswitch_3
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->Forbidden:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 227
    :sswitch_4
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->NotFound:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 230
    :sswitch_5
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->Conflict:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 233
    :sswitch_6
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->InternalError:Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {p0, v0}, Lcom/cleanmaster/net/a;->a(Lcom/cleanmaster/net/ResponseCode;)V

    goto :goto_0

    .line 213
    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_0
        0x190 -> :sswitch_1
        0x191 -> :sswitch_2
        0x193 -> :sswitch_3
        0x194 -> :sswitch_4
        0x199 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method
