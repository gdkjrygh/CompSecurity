.class public final enum Lcom/mopub/common/CloseableLayout$ClosePosition;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/CloseableLayout$ClosePosition;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BOTTOM_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field public static final enum BOTTOM_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field public static final enum BOTTOM_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field public static final enum CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field public static final enum TOP_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field public static final enum TOP_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field public static final enum TOP_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

.field private static final synthetic b:[Lcom/mopub/common/CloseableLayout$ClosePosition;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 53
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "TOP_LEFT"

    const/16 v2, 0x33

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 54
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "TOP_CENTER"

    const/16 v2, 0x31

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 55
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "TOP_RIGHT"

    const/16 v2, 0x35

    invoke-direct {v0, v1, v6, v2}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 56
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "CENTER"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v7, v2}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 57
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "BOTTOM_LEFT"

    const/16 v2, 0x53

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 58
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "BOTTOM_CENTER"

    const/4 v2, 0x5

    const/16 v3, 0x51

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 59
    new-instance v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    const-string v1, "BOTTOM_RIGHT"

    const/4 v2, 0x6

    const/16 v3, 0x55

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/CloseableLayout$ClosePosition;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    .line 52
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/mopub/common/CloseableLayout$ClosePosition;

    sget-object v1, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/CloseableLayout$ClosePosition;->TOP_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/common/CloseableLayout$ClosePosition;->CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_LEFT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_CENTER:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/mopub/common/CloseableLayout$ClosePosition;->BOTTOM_RIGHT:Lcom/mopub/common/CloseableLayout$ClosePosition;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->b:[Lcom/mopub/common/CloseableLayout$ClosePosition;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 64
    iput p3, p0, Lcom/mopub/common/CloseableLayout$ClosePosition;->a:I

    .line 65
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/CloseableLayout$ClosePosition;
    .locals 1

    .prologue
    .line 52
    const-class v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/CloseableLayout$ClosePosition;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/CloseableLayout$ClosePosition;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/mopub/common/CloseableLayout$ClosePosition;->b:[Lcom/mopub/common/CloseableLayout$ClosePosition;

    invoke-virtual {v0}, [Lcom/mopub/common/CloseableLayout$ClosePosition;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/CloseableLayout$ClosePosition;

    return-object v0
.end method


# virtual methods
.method final a()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/mopub/common/CloseableLayout$ClosePosition;->a:I

    return v0
.end method
