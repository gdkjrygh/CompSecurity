.class final enum Lcom/roidapp/imagelib/filter/bm;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/imagelib/filter/bm;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/imagelib/filter/bm;

.field public static final enum b:Lcom/roidapp/imagelib/filter/bm;

.field public static final enum c:Lcom/roidapp/imagelib/filter/bm;

.field public static final enum d:Lcom/roidapp/imagelib/filter/bm;

.field public static final enum e:Lcom/roidapp/imagelib/filter/bm;

.field public static final enum f:Lcom/roidapp/imagelib/filter/bm;

.field public static final enum g:Lcom/roidapp/imagelib/filter/bm;

.field private static final synthetic h:[Lcom/roidapp/imagelib/filter/bm;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 494
    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "LONG"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->a:Lcom/roidapp/imagelib/filter/bm;

    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "DOUBLE"

    invoke-direct {v0, v1, v4}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->b:Lcom/roidapp/imagelib/filter/bm;

    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "INTEGER"

    invoke-direct {v0, v1, v5}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->c:Lcom/roidapp/imagelib/filter/bm;

    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "FLOAT"

    invoke-direct {v0, v1, v6}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->d:Lcom/roidapp/imagelib/filter/bm;

    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "SHORT"

    invoke-direct {v0, v1, v7}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->e:Lcom/roidapp/imagelib/filter/bm;

    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "BYTE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->f:Lcom/roidapp/imagelib/filter/bm;

    new-instance v0, Lcom/roidapp/imagelib/filter/bm;

    const-string v1, "BIG_DECIMAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roidapp/imagelib/filter/bm;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->g:Lcom/roidapp/imagelib/filter/bm;

    .line 493
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/roidapp/imagelib/filter/bm;

    sget-object v1, Lcom/roidapp/imagelib/filter/bm;->a:Lcom/roidapp/imagelib/filter/bm;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/imagelib/filter/bm;->b:Lcom/roidapp/imagelib/filter/bm;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/imagelib/filter/bm;->c:Lcom/roidapp/imagelib/filter/bm;

    aput-object v1, v0, v5

    sget-object v1, Lcom/roidapp/imagelib/filter/bm;->d:Lcom/roidapp/imagelib/filter/bm;

    aput-object v1, v0, v6

    sget-object v1, Lcom/roidapp/imagelib/filter/bm;->e:Lcom/roidapp/imagelib/filter/bm;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/roidapp/imagelib/filter/bm;->f:Lcom/roidapp/imagelib/filter/bm;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/roidapp/imagelib/filter/bm;->g:Lcom/roidapp/imagelib/filter/bm;

    aput-object v2, v0, v1

    sput-object v0, Lcom/roidapp/imagelib/filter/bm;->h:[Lcom/roidapp/imagelib/filter/bm;

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
    .line 493
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/Number;)Lcom/roidapp/imagelib/filter/bm;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Number;",
            ">(TE;)",
            "Lcom/roidapp/imagelib/filter/bm;"
        }
    .end annotation

    .prologue
    .line 498
    instance-of v0, p0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 499
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->a:Lcom/roidapp/imagelib/filter/bm;

    .line 517
    :goto_0
    return-object v0

    .line 501
    :cond_0
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_1

    .line 502
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->b:Lcom/roidapp/imagelib/filter/bm;

    goto :goto_0

    .line 504
    :cond_1
    instance-of v0, p0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 505
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->c:Lcom/roidapp/imagelib/filter/bm;

    goto :goto_0

    .line 507
    :cond_2
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_3

    .line 508
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->d:Lcom/roidapp/imagelib/filter/bm;

    goto :goto_0

    .line 510
    :cond_3
    instance-of v0, p0, Ljava/lang/Short;

    if-eqz v0, :cond_4

    .line 511
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->e:Lcom/roidapp/imagelib/filter/bm;

    goto :goto_0

    .line 513
    :cond_4
    instance-of v0, p0, Ljava/lang/Byte;

    if-eqz v0, :cond_5

    .line 514
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->f:Lcom/roidapp/imagelib/filter/bm;

    goto :goto_0

    .line 516
    :cond_5
    instance-of v0, p0, Ljava/math/BigDecimal;

    if-eqz v0, :cond_6

    .line 517
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->g:Lcom/roidapp/imagelib/filter/bm;

    goto :goto_0

    .line 519
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Number class \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' is not supported"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/imagelib/filter/bm;
    .locals 1

    .prologue
    .line 493
    const-class v0, Lcom/roidapp/imagelib/filter/bm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/bm;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/imagelib/filter/bm;
    .locals 1

    .prologue
    .line 493
    sget-object v0, Lcom/roidapp/imagelib/filter/bm;->h:[Lcom/roidapp/imagelib/filter/bm;

    invoke-virtual {v0}, [Lcom/roidapp/imagelib/filter/bm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/imagelib/filter/bm;

    return-object v0
.end method
