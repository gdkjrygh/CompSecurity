.class public Lcom/qihoo/security/leak/b;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const-string/jumbo v0, "000000247d289d211b690fe2e3767a12ef1c702ba58d0f3188d28f45fd2aee1e0644d607f3d03f9090649412"

    invoke-static {v0}, Lcom/qihoo/security/leak/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/leak/b;->a:Ljava/lang/String;

    .line 12
    const-string/jumbo v0, "000000367d289d211b690fe2e3767a12ef1c702bc878fe44d02f3f0089f6af9f49726e49332d2ffd2a011985729b8b3dcca26fe2e7102f8079dc13be"

    invoke-static {v0}, Lcom/qihoo/security/leak/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/leak/b;->b:Ljava/lang/String;

    .line 13
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 16
    new-instance v0, Lcom/qihoo360/common/utils/TEA;

    const-string/jumbo v1, "b1003b8fc038cbbf01d92b91166661a1"

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo360/common/utils/TEA;-><init>([B)V

    .line 17
    invoke-static {p0}, Lcom/qihoo360/common/utils/Utils;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/qihoo360/common/utils/TEA;->decrypt([B)[B

    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1
.end method
