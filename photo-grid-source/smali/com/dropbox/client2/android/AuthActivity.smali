.class public Lcom/dropbox/client2/android/AuthActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static final ACTION_AUTHENTICATE_V1:Ljava/lang/String; = "com.dropbox.android.AUTHENTICATE_V1"

.field public static final ACTION_AUTHENTICATE_V2:Ljava/lang/String; = "com.dropbox.android.AUTHENTICATE_V2"

.field public static final AUTH_PATH_CONNECT:Ljava/lang/String; = "/connect"

.field public static final AUTH_VERSION:I = 0x1

.field private static final DEFAULT_WEB_HOST:Ljava/lang/String; = "www.dropbox.com"

.field private static final DROPBOX_APP_SIGNATURES:[Ljava/lang/String;

.field public static final EXTRA_ACCESS_SECRET:Ljava/lang/String; = "ACCESS_SECRET"

.field public static final EXTRA_ACCESS_TOKEN:Ljava/lang/String; = "ACCESS_TOKEN"

.field public static final EXTRA_ALREADY_AUTHED_UIDS:Ljava/lang/String; = "ALREADY_AUTHED_UIDS"

.field public static final EXTRA_AUTH_STATE:Ljava/lang/String; = "AUTH_STATE"

.field public static final EXTRA_CALLING_CLASS:Ljava/lang/String; = "CALLING_CLASS"

.field public static final EXTRA_CALLING_PACKAGE:Ljava/lang/String; = "CALLING_PACKAGE"

.field public static final EXTRA_CONSUMER_KEY:Ljava/lang/String; = "CONSUMER_KEY"

.field public static final EXTRA_CONSUMER_SIG:Ljava/lang/String; = "CONSUMER_SIG"

.field public static final EXTRA_DESIRED_UID:Ljava/lang/String; = "DESIRED_UID"

.field public static final EXTRA_UID:Ljava/lang/String; = "UID"

.field private static final SIS_KEY_AUTH_STATE_NONCE:Ljava/lang/String; = "SIS_KEY_AUTH_STATE_NONCE"

.field private static final TAG:Ljava/lang/String;

.field public static result:Landroid/content/Intent;

.field private static sAlreadyAuthedUids:[Ljava/lang/String;

.field private static sApiType:Ljava/lang/String;

.field private static sAppKey:Ljava/lang/String;

.field private static sAppSecret:Ljava/lang/String;

.field private static sDesiredUid:Ljava/lang/String;

.field private static sSecurityProvider:Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;

.field private static final sSecurityProviderLock:Ljava/lang/Object;

.field private static sWebHost:Ljava/lang/String;


# instance fields
.field private mActivityDispatchHandlerPosted:Z

.field private mAlreadyAuthedUids:[Ljava/lang/String;

.field private mApiType:Ljava/lang/String;

.field private mAppKey:Ljava/lang/String;

.field private mAppSecret:Ljava/lang/String;

.field private mAuthStateNonce:Ljava/lang/String;

.field private mDesiredUid:Ljava/lang/String;

.field private mWebHost:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 42
    const-class v0, Lcom/dropbox/client2/android/AuthActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->TAG:Ljava/lang/String;

    .line 147
    new-instance v0, Lcom/dropbox/client2/android/AuthActivity$1;

    invoke-direct {v0}, Lcom/dropbox/client2/android/AuthActivity$1;-><init>()V

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->sSecurityProvider:Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;

    .line 153
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->sSecurityProviderLock:Ljava/lang/Object;

    .line 156
    const/4 v0, 0x0

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 161
    const-string v0, "www.dropbox.com"

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->sWebHost:Ljava/lang/String;

    .line 593
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "308202223082018b02044bd207bd300d06092a864886f70d01010405003058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d65796572301e170d3130303432333230343930315a170d3430303431353230343930315a3058310b3009060355040613025553310b3009060355040813024341311630140603550407130d53616e204672616e636973636f3110300e060355040a130744726f70626f783112301006035504031309546f6d204d6579657230819f300d06092a864886f70d010101050003818d0030818902818100ac1595d0ab278a9577f0ca5a14144f96eccde75f5616f36172c562fab0e98c48ad7d64f1091c6cc11ce084a4313d522f899378d312e112a748827545146a779defa7c31d8c00c2ed73135802f6952f59798579859e0214d4e9c0554b53b26032a4d2dfc2f62540d776df2ea70e2a6152945fb53fef5bac5344251595b729d4810203010001300d06092a864886f70d01010405000381810055c425d94d036153203dc0bbeb3516f94563b102fff39c3d4ed91278db24fc4424a244c2e59f03bbfea59404512b8bf74662f2a32e37eafa2ac904c31f99cfc21c9ff375c977c432d3b6ec22776f28767d0f292144884538c3d5669b568e4254e4ed75d9054f75229ac9d4ccd0b7c3c74a34f07b7657083b2aa76225c0c56ffc"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "308201e53082014ea00302010202044e17e115300d06092a864886f70d01010505003037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f6964204465627567301e170d3131303730393035303331375a170d3431303730313035303331375a3037310b30090603550406130255533110300e060355040a1307416e64726f6964311630140603550403130d416e64726f696420446562756730819f300d06092a864886f70d010101050003818d003081890281810096759fe5abea6a0757039b92adc68d672efa84732c3f959408e12efa264545c61f23141026a6d01eceeeaa13ec7087087e5894a3363da8bf5c69ed93657a6890738a80998e4ca22dc94848f30e2d0e1890000ae2cddf543b20c0c3828deca6c7944b5ecd21a9d18c988b2b3e54517dafbc34b48e801bb1321e0fa49e4d575d7f0203010001300d06092a864886f70d0101050500038181002b6d4b65bcfa6ec7bac97ae6d878064d47b3f9f8da654995b8ef4c385bc4fbfbb7a987f60783ef0348760c0708acd4b7e63f0235c35a4fbcd5ec41b3b4cb295feaa7d5c27fa562a02562b7e1f4776b85147be3e295714986c4a9a07183f48ea09ae4d3ea31b88d0016c65b93526b9c45f2967c3d28dee1aff5a5b29b9c2c8639"

    aput-object v2, v0, v1

    sput-object v0, Lcom/dropbox/client2/android/AuthActivity;->DROPBOX_APP_SIGNATURES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 177
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    .line 179
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mActivityDispatchHandlerPosted:Z

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100(Lcom/dropbox/client2/android/AuthActivity;Landroid/content/Intent;)Z
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/dropbox/client2/android/AuthActivity;->hasDropboxApp(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$200(Lcom/dropbox/client2/android/AuthActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/dropbox/client2/android/AuthActivity;->startWebAuth(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$302(Lcom/dropbox/client2/android/AuthActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    return-object p1
.end method

.method private authFinished(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 513
    sput-object p1, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 514
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    .line 515
    invoke-virtual {p0}, Lcom/dropbox/client2/android/AuthActivity;->finish()V

    .line 516
    return-void
.end method

.method public static checkAppBeforeAuth(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 257
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 258
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "db-"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 259
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "://1/connect"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 260
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 261
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 262
    invoke-virtual {v4, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    .line 264
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_1

    .line 265
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "URI scheme in your app\'s manifest is not set up correctly. You should have a "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/dropbox/client2/android/AuthActivity;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with the scheme: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 269
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v1, :cond_3

    .line 270
    if-eqz p2, :cond_2

    .line 271
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 272
    const-string v2, "Security alert"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 273
    const-string v2, "Another app on your phone may be trying to pose as the app you are currently using. The malicious app can\'t access your account, but linking to Dropbox has been disabled as a precaution. Please contact support@dropbox.com."

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 278
    const-string v2, "OK"

    new-instance v3, Lcom/dropbox/client2/android/AuthActivity$2;

    invoke-direct {v3}, Lcom/dropbox/client2/android/AuthActivity$2;-><init>()V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 284
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 310
    :goto_0
    return v0

    .line 286
    :cond_2
    sget-object v1, Lcom/dropbox/client2/android/AuthActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "There are multiple apps registered for the AuthActivity URI scheme ("

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ").  Another app may be trying to  impersonate this app, so authentication will be disabled."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 295
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 296
    if-eqz v0, :cond_4

    iget-object v2, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 298
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "There must be a "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/dropbox/client2/android/AuthActivity;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " within your app\'s package registered for your URI scheme ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "). However, it appears that an activity in a different package is registered for that scheme instead. If you have multiple apps that all want to use the same accesstoken pair, designate one of them to do authentication and have the other apps launch it and then retrieve the token pair from it."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move v0, v1

    .line 310
    goto :goto_0
.end method

.method private createStateNonce()Ljava/lang/String;
    .locals 8

    .prologue
    const/16 v7, 0x10

    const/4 v1, 0x0

    .line 629
    new-array v2, v7, [B

    .line 630
    invoke-static {}, Lcom/dropbox/client2/android/AuthActivity;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 631
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 632
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppSecret:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 633
    const-string v0, "oauth2:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    move v0, v1

    .line 635
    :goto_0
    if-ge v0, v7, :cond_1

    .line 636
    const-string v4, "%02x"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aget-byte v6, v2, v0

    and-int/lit16 v6, v6, 0xff

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 638
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getConsumerSig()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 519
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppSecret:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 530
    :goto_0
    return-object v0

    .line 523
    :cond_0
    :try_start_0
    const-string v0, "SHA-1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 527
    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    iget-object v2, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppSecret:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v3, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 528
    new-instance v1, Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-direct {v1, v4, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 529
    const-string v0, "%1$040X"

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v3

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 530
    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 524
    :catch_0
    move-exception v0

    .line 525
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static getOfficialAuthIntent()Landroid/content/Intent;
    .locals 2

    .prologue
    .line 377
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.dropbox.android.AUTHENTICATE_V2"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 378
    const-string v1, "com.dropbox.android"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 379
    return-object v0
.end method

.method private static getSecureRandom()Ljava/security/SecureRandom;
    .locals 1

    .prologue
    .line 338
    invoke-static {}, Lcom/dropbox/client2/android/AuthActivity;->getSecurityProvider()Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;

    move-result-object v0

    .line 339
    if-eqz v0, :cond_0

    .line 340
    invoke-interface {v0}, Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;->getSecureRandom()Ljava/security/SecureRandom;

    move-result-object v0

    .line 342
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    goto :goto_0
.end method

.method private static getSecurityProvider()Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;
    .locals 2

    .prologue
    .line 332
    sget-object v1, Lcom/dropbox/client2/android/AuthActivity;->sSecurityProviderLock:Ljava/lang/Object;

    monitor-enter v1

    .line 333
    :try_start_0
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sSecurityProvider:Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;

    monitor-exit v1

    return-object v0

    .line 334
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private hasDropboxApp(Landroid/content/Intent;)Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 534
    invoke-virtual {p0}, Lcom/dropbox/client2/android/AuthActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 536
    invoke-virtual {v2, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 537
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_1

    .line 567
    :cond_0
    :goto_0
    return v0

    .line 544
    :cond_1
    invoke-virtual {v2, p1, v0}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v3

    .line 545
    if-eqz v3, :cond_0

    .line 551
    :try_start_0
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    const/16 v4, 0x40

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 558
    iget-object v4, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v5, v4

    move v3, v0

    :goto_1
    if-ge v3, v5, :cond_0

    aget-object v6, v4, v3

    .line 559
    sget-object v7, Lcom/dropbox/client2/android/AuthActivity;->DROPBOX_APP_SIGNATURES:[Ljava/lang/String;

    array-length v8, v7

    move v2, v0

    :goto_2
    if-ge v2, v8, :cond_3

    aget-object v9, v7, v2

    .line 560
    invoke-virtual {v6}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move v0, v1

    .line 561
    goto :goto_0

    .line 559
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 558
    :cond_3
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    .line 555
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static makeIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 218
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'appKey\' can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 219
    :cond_0
    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'appSecret\' can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v0, p1

    move-object v1, p2

    move-object v3, v2

    move-object v4, p3

    move-object v5, p4

    .line 220
    invoke-static/range {v0 .. v5}, Lcom/dropbox/client2/android/AuthActivity;->setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dropbox/client2/android/AuthActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method public static makeOAuth2Intent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 237
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\'appKey\' can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v0, p1

    move-object v2, v1

    move-object v3, v1

    move-object v4, p2

    move-object v5, p3

    .line 238
    invoke-static/range {v0 .. v5}, Lcom/dropbox/client2/android/AuthActivity;->setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/dropbox/client2/android/AuthActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method static setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 186
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, v4

    invoke-static/range {v0 .. v5}, Lcom/dropbox/client2/android/AuthActivity;->setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    return-void
.end method

.method static setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 194
    sput-object p0, Lcom/dropbox/client2/android/AuthActivity;->sAppKey:Ljava/lang/String;

    .line 195
    sput-object p1, Lcom/dropbox/client2/android/AuthActivity;->sAppSecret:Ljava/lang/String;

    .line 196
    sput-object p2, Lcom/dropbox/client2/android/AuthActivity;->sDesiredUid:Ljava/lang/String;

    .line 197
    if-eqz p3, :cond_0

    :goto_0
    sput-object p3, Lcom/dropbox/client2/android/AuthActivity;->sAlreadyAuthedUids:[Ljava/lang/String;

    .line 198
    if-eqz p4, :cond_1

    :goto_1
    sput-object p4, Lcom/dropbox/client2/android/AuthActivity;->sWebHost:Ljava/lang/String;

    .line 199
    sput-object p5, Lcom/dropbox/client2/android/AuthActivity;->sApiType:Ljava/lang/String;

    .line 200
    return-void

    .line 197
    :cond_0
    const/4 v0, 0x0

    new-array p3, v0, [Ljava/lang/String;

    goto :goto_0

    .line 198
    :cond_1
    const-string p4, "www.dropbox.com"

    goto :goto_1
.end method

.method public static setSecurityProvider(Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;)V
    .locals 2

    .prologue
    .line 326
    sget-object v1, Lcom/dropbox/client2/android/AuthActivity;->sSecurityProviderLock:Ljava/lang/Object;

    monitor-enter v1

    .line 327
    :try_start_0
    sput-object p0, Lcom/dropbox/client2/android/AuthActivity;->sSecurityProvider:Lcom/dropbox/client2/android/AuthActivity$SecurityProvider;

    .line 328
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private startWebAuth(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 571
    const-string v1, "/connect"

    .line 572
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 577
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAlreadyAuthedUids:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAlreadyAuthedUids:[Ljava/lang/String;

    aget-object v0, v0, v5

    .line 579
    :goto_0
    const/16 v3, 0xc

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "locale"

    aput-object v4, v3, v5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v6

    const/4 v2, 0x2

    const-string v4, "k"

    aput-object v4, v3, v2

    const/4 v2, 0x3

    iget-object v4, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppKey:Ljava/lang/String;

    aput-object v4, v3, v2

    const/4 v2, 0x4

    const-string v4, "n"

    aput-object v4, v3, v2

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    const-string v2, "s"

    aput-object v2, v3, v0

    const/4 v0, 0x7

    invoke-direct {p0}, Lcom/dropbox/client2/android/AuthActivity;->getConsumerSig()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v0

    const/16 v0, 0x8

    const-string v2, "api"

    aput-object v2, v3, v0

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/dropbox/client2/android/AuthActivity;->mApiType:Ljava/lang/String;

    aput-object v2, v3, v0

    const/16 v0, 0xa

    const-string v2, "state"

    aput-object v2, v3, v0

    const/16 v0, 0xb

    aput-object p1, v3, v0

    .line 587
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mWebHost:Ljava/lang/String;

    invoke-static {v0, v6, v1, v3}, Lcom/dropbox/client2/RESTUtility;->buildURL(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 589
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 590
    invoke-virtual {p0, v1}, Lcom/dropbox/client2/android/AuthActivity;->startActivity(Landroid/content/Intent;)V

    .line 591
    return-void

    .line 577
    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 347
    if-nez p1, :cond_0

    .line 348
    sput-object v1, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 349
    iput-object v1, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    .line 350
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sAppKey:Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppKey:Ljava/lang/String;

    .line 351
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sAppSecret:Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppSecret:Ljava/lang/String;

    .line 352
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sWebHost:Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mWebHost:Ljava/lang/String;

    .line 353
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sApiType:Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mApiType:Ljava/lang/String;

    .line 354
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sDesiredUid:Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mDesiredUid:Ljava/lang/String;

    .line 355
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->sAlreadyAuthedUids:[Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAlreadyAuthedUids:[Ljava/lang/String;

    .line 360
    :goto_0
    invoke-static {v1, v1, v1, v1}, Lcom/dropbox/client2/android/AuthActivity;->setAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 361
    const v0, 0x1030010

    invoke-virtual {p0, v0}, Lcom/dropbox/client2/android/AuthActivity;->setTheme(I)V

    .line 363
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 364
    return-void

    .line 357
    :cond_0
    const-string v0, "SIS_KEY_AUTH_STATE_NONCE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    goto :goto_0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 458
    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 459
    invoke-direct {p0, v0}, Lcom/dropbox/client2/android/AuthActivity;->authFinished(Landroid/content/Intent;)V

    .line 510
    :goto_0
    return-void

    .line 465
    :cond_0
    const-string v1, "ACCESS_TOKEN"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 467
    const-string v1, "ACCESS_TOKEN"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 468
    const-string v1, "ACCESS_SECRET"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 469
    const-string v1, "UID"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 470
    const-string v1, "AUTH_STATE"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 488
    :goto_1
    if-eqz v4, :cond_4

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    if-eqz v3, :cond_1

    const-string v5, ""

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_1
    if-eqz v2, :cond_4

    const-string v5, ""

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    if-eqz v1, :cond_4

    const-string v5, ""

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 494
    iget-object v5, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 495
    invoke-direct {p0, v0}, Lcom/dropbox/client2/android/AuthActivity;->authFinished(Landroid/content/Intent;)V

    goto :goto_0

    .line 473
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 474
    if-eqz v4, :cond_5

    .line 475
    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 476
    const-string v2, "/connect"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 478
    :try_start_0
    const-string v1, "oauth_token"

    invoke-virtual {v4, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 479
    :try_start_1
    const-string v1, "oauth_token_secret"

    invoke-virtual {v4, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    .line 480
    :try_start_2
    const-string v1, "uid"

    invoke-virtual {v4, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v1

    .line 481
    :try_start_3
    const-string v5, "state"

    invoke-virtual {v4, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v4

    move-object v6, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v6

    .line 482
    goto :goto_1

    :catch_0
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    :goto_2
    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    goto :goto_1

    .line 500
    :cond_3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 501
    const-string v1, "ACCESS_TOKEN"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 502
    const-string v1, "ACCESS_SECRET"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 503
    const-string v1, "UID"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 509
    :cond_4
    invoke-direct {p0, v0}, Lcom/dropbox/client2/android/AuthActivity;->authFinished(Landroid/content/Intent;)V

    goto/16 :goto_0

    :catch_1
    move-exception v1

    move-object v1, v0

    move-object v2, v0

    goto :goto_2

    :catch_2
    move-exception v1

    move-object v1, v0

    goto :goto_2

    :catch_3
    move-exception v4

    goto :goto_2

    :cond_5
    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    goto/16 :goto_1
.end method

.method protected onResume()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 385
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 387
    invoke-virtual {p0}, Lcom/dropbox/client2/android/AuthActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    :goto_0
    return-void

    .line 391
    :cond_0
    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppKey:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 396
    :cond_1
    invoke-direct {p0, v1}, Lcom/dropbox/client2/android/AuthActivity;->authFinished(Landroid/content/Intent;)V

    goto :goto_0

    .line 400
    :cond_2
    sput-object v1, Lcom/dropbox/client2/android/AuthActivity;->result:Landroid/content/Intent;

    .line 402
    iget-boolean v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mActivityDispatchHandlerPosted:Z

    if-eqz v0, :cond_3

    .line 403
    sget-object v0, Lcom/dropbox/client2/android/AuthActivity;->TAG:Ljava/lang/String;

    const-string v1, "onResume called again before Handler run"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 410
    :cond_3
    invoke-direct {p0}, Lcom/dropbox/client2/android/AuthActivity;->createStateNonce()Ljava/lang/String;

    move-result-object v0

    .line 413
    invoke-static {}, Lcom/dropbox/client2/android/AuthActivity;->getOfficialAuthIntent()Landroid/content/Intent;

    move-result-object v1

    .line 414
    const-string v2, "CONSUMER_KEY"

    iget-object v3, p0, Lcom/dropbox/client2/android/AuthActivity;->mAppKey:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 415
    const-string v2, "CONSUMER_SIG"

    invoke-direct {p0}, Lcom/dropbox/client2/android/AuthActivity;->getConsumerSig()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 416
    const-string v2, "DESIRED_UID"

    iget-object v3, p0, Lcom/dropbox/client2/android/AuthActivity;->mDesiredUid:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 417
    const-string v2, "ALREADY_AUTHED_UIDS"

    iget-object v3, p0, Lcom/dropbox/client2/android/AuthActivity;->mAlreadyAuthedUids:[Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 418
    const-string v2, "CALLING_PACKAGE"

    invoke-virtual {p0}, Lcom/dropbox/client2/android/AuthActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 419
    const-string v2, "CALLING_CLASS"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 420
    const-string v2, "AUTH_STATE"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 429
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lcom/dropbox/client2/android/AuthActivity$3;

    invoke-direct {v3, p0, v1, v0}, Lcom/dropbox/client2/android/AuthActivity$3;-><init>(Lcom/dropbox/client2/android/AuthActivity;Landroid/content/Intent;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 451
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/dropbox/client2/android/AuthActivity;->mActivityDispatchHandlerPosted:Z

    goto :goto_0
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 368
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 369
    const-string v0, "SIS_KEY_AUTH_STATE_NONCE"

    iget-object v1, p0, Lcom/dropbox/client2/android/AuthActivity;->mAuthStateNonce:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    return-void
.end method
