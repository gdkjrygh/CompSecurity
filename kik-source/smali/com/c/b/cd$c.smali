.class abstract enum Lcom/c/b/cd$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/cd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4408
    name = "c"
.end annotation


# static fields
.field public static final enum a:Lcom/c/b/cd$c;

.field public static final enum b:Lcom/c/b/cd$c;

.field public static final enum c:Lcom/c/b/cd$c;

.field private static final synthetic d:[Lcom/c/b/cd$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 172
    new-instance v0, Lcom/c/b/ci;

    const-string v1, "LOOSE"

    invoke-direct {v0, v1}, Lcom/c/b/ci;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/b/cd$c;->a:Lcom/c/b/cd$c;

    .line 178
    new-instance v0, Lcom/c/b/cj;

    const-string v1, "STRICT"

    invoke-direct {v0, v1}, Lcom/c/b/cj;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/b/cd$c;->b:Lcom/c/b/cd$c;

    .line 184
    new-instance v0, Lcom/c/b/ck;

    const-string v1, "LAZY"

    invoke-direct {v0, v1}, Lcom/c/b/ck;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/c/b/cd$c;->c:Lcom/c/b/cd$c;

    .line 170
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/c/b/cd$c;

    const/4 v1, 0x0

    sget-object v2, Lcom/c/b/cd$c;->a:Lcom/c/b/cd$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/c/b/cd$c;->b:Lcom/c/b/cd$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/c/b/cd$c;->c:Lcom/c/b/cd$c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/c/b/cd$c;->d:[Lcom/c/b/cd$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 170
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 170
    invoke-direct {p0, p1, p2}, Lcom/c/b/cd$c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/c/b/cd$c;
    .locals 1

    .prologue
    .line 170
    const-class v0, Lcom/c/b/cd$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/c/b/cd$c;

    return-object v0
.end method

.method public static values()[Lcom/c/b/cd$c;
    .locals 1

    .prologue
    .line 170
    sget-object v0, Lcom/c/b/cd$c;->d:[Lcom/c/b/cd$c;

    invoke-virtual {v0}, [Lcom/c/b/cd$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/b/cd$c;

    return-object v0
.end method


# virtual methods
.method abstract a(Lcom/c/b/g;)Ljava/lang/Object;
.end method
