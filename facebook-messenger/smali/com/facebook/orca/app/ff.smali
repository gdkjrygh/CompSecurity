.class public Lcom/facebook/orca/app/ff;
.super Ljava/lang/Object;
.source "OrcaAppTypes.java"


# static fields
.field public static final a:Lcom/facebook/config/a/a;

.field public static final b:Lcom/facebook/config/a/a;

.field public static final c:Lcom/facebook/config/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    .line 16
    new-instance v0, Lcom/facebook/config/a/a;

    const-string v1, "dev"

    const-string v2, "181425161904154"

    const-string v3, "29695f68d8dfa9d6a9cb4662735c9aff"

    const-string v4, "95a15d22a0e735b2983ecb9759dbaf91"

    const-string v5, "0SmP9AZrwrsbrHR2RyVaQ-sqRoukl2MAjk04Ibg"

    const-string v6, "Xt7gUVGsahT285mm_GF6NyGlLn0"

    const-string v7, "https://developers.facebook.com"

    sget-object v8, Lcom/facebook/config/a/b;->DEVELOPMENT:Lcom/facebook/config/a/b;

    sget-object v9, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    sget-object v10, Lcom/facebook/base/j;->DEBUG:Lcom/facebook/base/j;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/config/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/config/a/b;Lcom/facebook/config/a/d;Lcom/facebook/base/j;)V

    sput-object v0, Lcom/facebook/orca/app/ff;->a:Lcom/facebook/config/a/a;

    .line 28
    new-instance v0, Lcom/facebook/config/a/a;

    const-string v1, "in-house"

    const-string v2, "105910932827969"

    const-string v3, "3fd89d7c8cf293c5c6db88444077422f"

    const-string v4, "201f1a1fa4998b746f7b531e6434c224"

    const-string v5, "0e1ruJ7mZbBXS0h1Ffa7wWK4SMcshAyydjcm1qg"

    const-string v6, "pLdFLi7Y9fGRBYynu_0msNMhS_w"

    const-string v7, "https://m.facebook.com/mobile_builds"

    sget-object v8, Lcom/facebook/config/a/b;->FACEBOOK:Lcom/facebook/config/a/b;

    sget-object v9, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    sget-object v10, Lcom/facebook/base/j;->IN_HOUSE:Lcom/facebook/base/j;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/config/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/config/a/b;Lcom/facebook/config/a/d;Lcom/facebook/base/j;)V

    sput-object v0, Lcom/facebook/orca/app/ff;->b:Lcom/facebook/config/a/a;

    .line 40
    new-instance v0, Lcom/facebook/config/a/a;

    const-string v1, "prod"

    const-string v2, "256002347743983"

    const-string v3, "256002347743983"

    const-string v4, "374e60f8b9bb6b8cbb30f78030438895"

    const-string v5, "0e1ruJ7mZbBWslnLnQQ5RPITlJs7QBrg8JYbTyg"

    const-string v6, "c_0Yh6T3lvD4FVtzlEnJKk94sDY"

    const-string v7, "https://market.android.com/details?id=com.facebook.orca"

    sget-object v8, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    sget-object v9, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    sget-object v10, Lcom/facebook/base/j;->PROD:Lcom/facebook/base/j;

    invoke-direct/range {v0 .. v10}, Lcom/facebook/config/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/config/a/b;Lcom/facebook/config/a/d;Lcom/facebook/base/j;)V

    sput-object v0, Lcom/facebook/orca/app/ff;->c:Lcom/facebook/config/a/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
