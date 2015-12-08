.class public final enum La/a/a/a/a/b/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "La/a/a/a/a/b/y;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/a/a/a/a/b/y;

.field public static final enum b:La/a/a/a/a/b/y;

.field public static final enum c:La/a/a/a/a/b/y;

.field public static final enum d:La/a/a/a/a/b/y;

.field public static final enum e:La/a/a/a/a/b/y;

.field public static final enum f:La/a/a/a/a/b/y;

.field public static final enum g:La/a/a/a/a/b/y;

.field private static final synthetic i:[La/a/a/a/a/b/y;


# instance fields
.field public final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x0

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 85
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "WIFI_MAC_ADDRESS"

    invoke-direct {v0, v1, v6, v4}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->a:La/a/a/a/a/b/y;

    .line 86
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "BLUETOOTH_MAC_ADDRESS"

    invoke-direct {v0, v1, v4, v5}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->b:La/a/a/a/a/b/y;

    .line 89
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "FONT_TOKEN"

    const/16 v2, 0x35

    invoke-direct {v0, v1, v5, v2}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->c:La/a/a/a/a/b/y;

    .line 90
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "ANDROID_ID"

    const/16 v2, 0x64

    invoke-direct {v0, v1, v7, v2}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->d:La/a/a/a/a/b/y;

    .line 91
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "ANDROID_DEVICE_ID"

    const/16 v2, 0x65

    invoke-direct {v0, v1, v8, v2}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->e:La/a/a/a/a/b/y;

    .line 92
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "ANDROID_SERIAL"

    const/4 v2, 0x5

    const/16 v3, 0x66

    invoke-direct {v0, v1, v2, v3}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->f:La/a/a/a/a/b/y;

    .line 93
    new-instance v0, La/a/a/a/a/b/y;

    const-string v1, "ANDROID_ADVERTISING_ID"

    const/4 v2, 0x6

    const/16 v3, 0x67

    invoke-direct {v0, v1, v2, v3}, La/a/a/a/a/b/y;-><init>(Ljava/lang/String;II)V

    sput-object v0, La/a/a/a/a/b/y;->g:La/a/a/a/a/b/y;

    .line 83
    const/4 v0, 0x7

    new-array v0, v0, [La/a/a/a/a/b/y;

    sget-object v1, La/a/a/a/a/b/y;->a:La/a/a/a/a/b/y;

    aput-object v1, v0, v6

    sget-object v1, La/a/a/a/a/b/y;->b:La/a/a/a/a/b/y;

    aput-object v1, v0, v4

    sget-object v1, La/a/a/a/a/b/y;->c:La/a/a/a/a/b/y;

    aput-object v1, v0, v5

    sget-object v1, La/a/a/a/a/b/y;->d:La/a/a/a/a/b/y;

    aput-object v1, v0, v7

    sget-object v1, La/a/a/a/a/b/y;->e:La/a/a/a/a/b/y;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, La/a/a/a/a/b/y;->f:La/a/a/a/a/b/y;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, La/a/a/a/a/b/y;->g:La/a/a/a/a/b/y;

    aput-object v2, v0, v1

    sput-object v0, La/a/a/a/a/b/y;->i:[La/a/a/a/a/b/y;

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
    .line 97
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 98
    iput p3, p0, La/a/a/a/a/b/y;->h:I

    .line 99
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/a/a/a/a/b/y;
    .locals 1

    .prologue
    .line 83
    const-class v0, La/a/a/a/a/b/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, La/a/a/a/a/b/y;

    return-object v0
.end method

.method public static values()[La/a/a/a/a/b/y;
    .locals 1

    .prologue
    .line 83
    sget-object v0, La/a/a/a/a/b/y;->i:[La/a/a/a/a/b/y;

    invoke-virtual {v0}, [La/a/a/a/a/b/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/a/a/b/y;

    return-object v0
.end method
