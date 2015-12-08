.class public abstract enum Lcom/b/a/aa;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lcom/b/a/aa;

.field public static final enum b:Lcom/b/a/aa;

.field private static final synthetic c:[Lcom/b/a/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 27
    new-instance v0, Lcom/b/a/ab;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, Lcom/b/a/ab;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/b/a/aa;->a:Lcom/b/a/aa;

    .line 276
    new-instance v0, Lcom/b/a/ac;

    const-string v1, "STREAMED"

    invoke-direct {v0, v1}, Lcom/b/a/ac;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/b/a/aa;->b:Lcom/b/a/aa;

    .line 25
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/b/a/aa;

    const/4 v1, 0x0

    sget-object v2, Lcom/b/a/aa;->a:Lcom/b/a/aa;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/b/a/aa;->b:Lcom/b/a/aa;

    aput-object v2, v0, v1

    sput-object v0, Lcom/b/a/aa;->c:[Lcom/b/a/aa;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Lcom/b/a/aa;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/b/a/aa;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/b/a/aa;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/b/a/aa;

    return-object v0
.end method

.method public static values()[Lcom/b/a/aa;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/b/a/aa;->c:[Lcom/b/a/aa;

    invoke-virtual {v0}, [Lcom/b/a/aa;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/b/a/aa;

    return-object v0
.end method


# virtual methods
.method public abstract a(BLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
.end method

.method public abstract a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
.end method

.method public abstract a(JLcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
.end method

.method public abstract a(Ljava/lang/String;Lcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
.end method

.method public abstract a([BILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;
.end method
