.class public final enum Lcom/facebook/http/b/av;
.super Ljava/lang/Enum;
.source "IFbHttpErrorReporter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/http/b/av;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/http/b/av;

.field public static final enum HTTP_CLIENT_EXECUTE:Lcom/facebook/http/b/av;

.field public static final enum READ_RESPONSE_BODY:Lcom/facebook/http/b/av;


# instance fields
.field private final mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 13
    new-instance v0, Lcom/facebook/http/b/av;

    const-string v1, "HTTP_CLIENT_EXECUTE"

    const-string v2, "http_client_execute"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/http/b/av;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/http/b/av;->HTTP_CLIENT_EXECUTE:Lcom/facebook/http/b/av;

    .line 14
    new-instance v0, Lcom/facebook/http/b/av;

    const-string v1, "READ_RESPONSE_BODY"

    const-string v2, "read_response_body"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/http/b/av;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/http/b/av;->READ_RESPONSE_BODY:Lcom/facebook/http/b/av;

    .line 12
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/http/b/av;

    sget-object v1, Lcom/facebook/http/b/av;->HTTP_CLIENT_EXECUTE:Lcom/facebook/http/b/av;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/http/b/av;->READ_RESPONSE_BODY:Lcom/facebook/http/b/av;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/http/b/av;->$VALUES:[Lcom/facebook/http/b/av;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 19
    iput-object p3, p0, Lcom/facebook/http/b/av;->mName:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/http/b/av;
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/facebook/http/b/av;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/b/av;

    return-object v0
.end method

.method public static values()[Lcom/facebook/http/b/av;
    .locals 1

    .prologue
    .line 12
    sget-object v0, Lcom/facebook/http/b/av;->$VALUES:[Lcom/facebook/http/b/av;

    invoke-virtual {v0}, [Lcom/facebook/http/b/av;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/http/b/av;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/http/b/av;->mName:Ljava/lang/String;

    return-object v0
.end method
