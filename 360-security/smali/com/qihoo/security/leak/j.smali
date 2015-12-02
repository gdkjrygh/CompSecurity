.class Lcom/qihoo/security/leak/j;
.super Lcom/qihoo/security/leak/c;
.source "360Security"


# static fields
.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 213
    new-instance v0, Ljava/lang/String;

    const-string/jumbo v1, "636f6d2e616e64726f69642e6d6d732e7472616e73616374696f6e2e536d73526563656976657253657276696365"

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->hexStringToBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    sput-object v0, Lcom/qihoo/security/leak/j;->e:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lcom/qihoo/security/leak/d;)V
    .locals 0

    .prologue
    .line 207
    invoke-direct {p0, p1}, Lcom/qihoo/security/leak/c;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 208
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 238
    const-string/jumbo v0, "leak_sms_service"

    return-object v0
.end method

.method b()Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 218
    iget-object v1, p0, Lcom/qihoo/security/leak/j;->a:Landroid/content/Context;

    .line 219
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 221
    :try_start_0
    const-string/jumbo v2, "com.android.mms"

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 223
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    .line 224
    if-eqz v2, :cond_0

    .line 225
    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 226
    sget-object v5, Lcom/qihoo/security/leak/j;->e:Ljava/lang/String;

    iget-object v6, v4, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 227
    iget-boolean v0, v4, Landroid/content/pm/ServiceInfo;->exported:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    :cond_0
    :goto_1
    return v0

    .line 225
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 231
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 243
    iget-object v0, p0, Lcom/qihoo/security/leak/j;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200ae

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 262
    const v0, 0x7f0e000d

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 248
    invoke-super {p0}, Lcom/qihoo/security/leak/c;->f()Z

    .line 250
    const/4 v0, 0x1

    return v0
.end method
