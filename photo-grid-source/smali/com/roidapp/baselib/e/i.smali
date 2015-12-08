.class public final enum Lcom/roidapp/baselib/e/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/baselib/e/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/baselib/e/i;

.field public static final enum b:Lcom/roidapp/baselib/e/i;

.field public static final enum c:Lcom/roidapp/baselib/e/i;

.field private static final synthetic d:[Lcom/roidapp/baselib/e/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-instance v0, Lcom/roidapp/baselib/e/i;

    const-string v1, "GET"

    invoke-direct {v0, v1, v2}, Lcom/roidapp/baselib/e/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/baselib/e/i;->a:Lcom/roidapp/baselib/e/i;

    new-instance v0, Lcom/roidapp/baselib/e/i;

    const-string v1, "POST"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/baselib/e/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v0, Lcom/roidapp/baselib/e/i;

    const-string v1, "DELETE"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/baselib/e/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/baselib/e/i;->c:Lcom/roidapp/baselib/e/i;

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/roidapp/baselib/e/i;

    sget-object v1, Lcom/roidapp/baselib/e/i;->a:Lcom/roidapp/baselib/e/i;

    aput-object v1, v0, v2

    sget-object v1, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/baselib/e/i;->c:Lcom/roidapp/baselib/e/i;

    aput-object v1, v0, v4

    sput-object v0, Lcom/roidapp/baselib/e/i;->d:[Lcom/roidapp/baselib/e/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/baselib/e/i;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/roidapp/baselib/e/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/e/i;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/baselib/e/i;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/roidapp/baselib/e/i;->d:[Lcom/roidapp/baselib/e/i;

    invoke-virtual {v0}, [Lcom/roidapp/baselib/e/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/baselib/e/i;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 30
    invoke-super {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
