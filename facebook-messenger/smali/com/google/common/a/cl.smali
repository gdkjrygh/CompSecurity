.class final enum Lcom/google/common/a/cl;
.super Ljava/lang/Enum;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Lcom/google/common/a/cm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/cl;",
        ">;",
        "Lcom/google/common/a/cm",
        "<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/cl;

.field public static final enum INSTANCE:Lcom/google/common/a/cl;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 772
    new-instance v0, Lcom/google/common/a/cl;

    const-string v1, "INSTANCE"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/cl;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/cl;->INSTANCE:Lcom/google/common/a/cl;

    .line 771
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/common/a/cl;

    sget-object v1, Lcom/google/common/a/cl;->INSTANCE:Lcom/google/common/a/cl;

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/common/a/cl;->$VALUES:[Lcom/google/common/a/cl;

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
    .line 771
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/cl;
    .locals 1

    .prologue
    .line 771
    const-class v0, Lcom/google/common/a/cl;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/cl;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/cl;
    .locals 1

    .prologue
    .line 771
    sget-object v0, Lcom/google/common/a/cl;->$VALUES:[Lcom/google/common/a/cl;

    invoke-virtual {v0}, [Lcom/google/common/a/cl;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/cl;

    return-object v0
.end method


# virtual methods
.method public getExpirationTime()J
    .locals 2

    .prologue
    .line 799
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getHash()I
    .locals 1

    .prologue
    .line 789
    const/4 v0, 0x0

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 794
    const/4 v0, 0x0

    return-object v0
.end method

.method public getNext()Lcom/google/common/a/cm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 784
    const/4 v0, 0x0

    return-object v0
.end method

.method public getNextEvictable()Lcom/google/common/a/cm;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 823
    return-object p0
.end method

.method public getNextExpirable()Lcom/google/common/a/cm;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 807
    return-object p0
.end method

.method public getPreviousEvictable()Lcom/google/common/a/cm;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 831
    return-object p0
.end method

.method public getPreviousExpirable()Lcom/google/common/a/cm;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 815
    return-object p0
.end method

.method public getValueReference()Lcom/google/common/a/dd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/dd",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 776
    const/4 v0, 0x0

    return-object v0
.end method

.method public setExpirationTime(J)V
    .locals 0

    .prologue
    .line 803
    return-void
.end method

.method public setNextEvictable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 827
    return-void
.end method

.method public setNextExpirable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 811
    return-void
.end method

.method public setPreviousEvictable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 835
    return-void
.end method

.method public setPreviousExpirable(Lcom/google/common/a/cm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/cm",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 819
    return-void
.end method

.method public setValueReference(Lcom/google/common/a/dd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/dd",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 780
    return-void
.end method
