.class public final Lcom/roidapp/photogrid/common/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Lcom/roidapp/photogrid/common/b;

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    const-string v0, ""

    sput-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    .line 9
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/b;->b:Lcom/roidapp/photogrid/common/b;

    .line 10
    const/16 v0, 0x15e

    sput v0, Lcom/roidapp/photogrid/common/b;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    :goto_0
    return-object v0

    .line 55
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 56
    const-string v0, ""

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1042
    :try_start_0
    sget-object v0, Lcom/roidapp/photogrid/common/b;->b:Lcom/roidapp/photogrid/common/b;

    if-nez v0, :cond_0

    .line 1043
    new-instance v0, Lcom/roidapp/photogrid/common/b;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/b;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/common/b;->b:Lcom/roidapp/photogrid/common/b;

    .line 1045
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/b;->b:Lcom/roidapp/photogrid/common/b;

    .line 22
    if-eqz v0, :cond_2

    .line 2032
    sget-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 2035
    sget-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sget v1, Lcom/roidapp/photogrid/common/b;->c:I

    if-le v0, v1, :cond_1

    .line 2036
    sget-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    sget-object v1, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    sget v2, Lcom/roidapp/photogrid/common/b;->c:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    .line 2038
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/common/b;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :cond_2
    :goto_0
    return-void

    .line 27
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
