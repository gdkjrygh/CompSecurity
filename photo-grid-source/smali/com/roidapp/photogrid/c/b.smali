.class public final enum Lcom/roidapp/photogrid/c/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/photogrid/c/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/photogrid/c/b;

.field public static final enum b:Lcom/roidapp/photogrid/c/b;

.field public static final enum c:Lcom/roidapp/photogrid/c/b;

.field public static final enum d:Lcom/roidapp/photogrid/c/b;

.field public static final enum e:Lcom/roidapp/photogrid/c/b;

.field private static final synthetic g:[Lcom/roidapp/photogrid/c/b;


# instance fields
.field private f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 10
    new-instance v0, Lcom/roidapp/photogrid/c/b;

    const-string v1, "ERROR_NETWORK"

    const-string v2, "network"

    invoke-direct {v0, v1, v3, v2}, Lcom/roidapp/photogrid/c/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/photogrid/c/b;->a:Lcom/roidapp/photogrid/c/b;

    .line 15
    new-instance v0, Lcom/roidapp/photogrid/c/b;

    const-string v1, "ERROR_CHECK"

    const-string v2, "check"

    invoke-direct {v0, v1, v4, v2}, Lcom/roidapp/photogrid/c/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/photogrid/c/b;->b:Lcom/roidapp/photogrid/c/b;

    .line 20
    new-instance v0, Lcom/roidapp/photogrid/c/b;

    const-string v1, "ERROR_DOWNLOAD"

    const-string v2, "download"

    invoke-direct {v0, v1, v5, v2}, Lcom/roidapp/photogrid/c/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/photogrid/c/b;->c:Lcom/roidapp/photogrid/c/b;

    .line 25
    new-instance v0, Lcom/roidapp/photogrid/c/b;

    const-string v1, "ERROR_MD5"

    const-string v2, "md5"

    invoke-direct {v0, v1, v6, v2}, Lcom/roidapp/photogrid/c/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/photogrid/c/b;->d:Lcom/roidapp/photogrid/c/b;

    .line 30
    new-instance v0, Lcom/roidapp/photogrid/c/b;

    const-string v1, "ERROR_USB"

    const-string v2, "usb"

    invoke-direct {v0, v1, v7, v2}, Lcom/roidapp/photogrid/c/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roidapp/photogrid/c/b;->e:Lcom/roidapp/photogrid/c/b;

    .line 4
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/roidapp/photogrid/c/b;

    sget-object v1, Lcom/roidapp/photogrid/c/b;->a:Lcom/roidapp/photogrid/c/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/photogrid/c/b;->b:Lcom/roidapp/photogrid/c/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/photogrid/c/b;->c:Lcom/roidapp/photogrid/c/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/roidapp/photogrid/c/b;->d:Lcom/roidapp/photogrid/c/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/roidapp/photogrid/c/b;->e:Lcom/roidapp/photogrid/c/b;

    aput-object v1, v0, v7

    sput-object v0, Lcom/roidapp/photogrid/c/b;->g:[Lcom/roidapp/photogrid/c/b;

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
    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 36
    iput-object p3, p0, Lcom/roidapp/photogrid/c/b;->f:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/photogrid/c/b;
    .locals 1

    .prologue
    .line 4
    const-class v0, Lcom/roidapp/photogrid/c/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/c/b;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/photogrid/c/b;
    .locals 1

    .prologue
    .line 4
    sget-object v0, Lcom/roidapp/photogrid/c/b;->g:[Lcom/roidapp/photogrid/c/b;

    invoke-virtual {v0}, [Lcom/roidapp/photogrid/c/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/c/b;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/c/b;->f:Ljava/lang/String;

    return-object v0
.end method
