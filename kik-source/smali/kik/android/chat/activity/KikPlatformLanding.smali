.class public Lkik/android/chat/activity/KikPlatformLanding;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field protected a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:Lkik/android/f/a/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikPlatformLanding;)Lkik/android/f/a/f;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 225
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    iget-object v1, p0, Lkik/android/chat/activity/KikPlatformLanding;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->d(Ljava/lang/String;)V

    .line 228
    :cond_0
    if-eqz p1, :cond_1

    .line 229
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    .line 230
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    .line 231
    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 238
    :goto_0
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->finish()V

    .line 239
    return-void

    .line 234
    :cond_1
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    .line 235
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a()Lkik/android/chat/fragment/KikConversationsFragment$a;

    .line 236
    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 14

    .prologue
    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 48
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->getIntent()Landroid/content/Intent;

    move-result-object v11

    .line 51
    invoke-virtual {v11}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_21

    if-eqz v0, :cond_0

    const-string v1, "kikapi"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "send"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "send.kik.com"

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedSchemeSpecificPart()Ljava/lang/String;

    new-instance v3, Landroid/net/UrlQuerySanitizer;

    invoke-direct {v3}, Landroid/net/UrlQuerySanitizer;-><init>()V

    invoke-virtual {v3, v9}, Landroid/net/UrlQuerySanitizer;->setAllowUnregisteredParamaters(Z)V

    invoke-static {}, Landroid/net/UrlQuerySanitizer;->getUrlAndSpaceLegal()Landroid/net/UrlQuerySanitizer$ValueSanitizer;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/net/UrlQuerySanitizer;->setUnregisteredParameterValueSanitizer(Landroid/net/UrlQuerySanitizer$ValueSanitizer;)V

    invoke-virtual {v3, v1}, Landroid/net/UrlQuerySanitizer;->parseQuery(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/net/UrlQuerySanitizer;->getParameterSet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "app-id"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "app-name"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "uri"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    move-object v0, v8

    :goto_0
    move-object v1, v0

    .line 52
    :goto_1
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/activity/KikPlatformLanding;)V

    .line 53
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    .line 54
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->b:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 56
    const v0, 0x7f09014f

    invoke-static {p0, v0, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 57
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lkik/android/chat/activity/IntroActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 58
    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikPlatformLanding;->startActivity(Landroid/content/Intent;)V

    .line 59
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->finish()V

    .line 112
    :goto_2
    return-void

    .line 51
    :cond_3
    const-string v1, "app-id"

    invoke-virtual {v3, v1}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "app-name"

    invoke-virtual {v3, v1}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "uri"

    invoke-virtual {v3, v4}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v4, "text"

    invoke-virtual {v3, v4}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "title"

    invoke-virtual {v3, v5}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v5, Ljava/util/Hashtable;

    invoke-direct {v5}, Ljava/util/Hashtable;-><init>()V

    if-eqz v7, :cond_4

    const-string v12, "title"

    invoke-virtual {v5, v12, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    if-eqz v4, :cond_5

    const-string v7, "text"

    invoke-virtual {v5, v7, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eqz v1, :cond_6

    const-string v4, "app-name"

    invoke-virtual {v5, v4, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    const-string v1, "allow-forward"

    const-string v4, "true"

    invoke-virtual {v5, v1, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Ljava/util/Hashtable;

    invoke-direct {v7}, Ljava/util/Hashtable;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "extra-"

    new-instance v12, Lcom/kik/f/a/a/a;

    const-string v13, "app-name"

    invoke-direct {v12, v6, v13}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v3, v0}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_8

    const-string v13, ""

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v12

    invoke-virtual {v0, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v12, "true"

    invoke-virtual {v7, v0, v12}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_9
    const-string v12, "android-uri"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    new-instance v12, Lcom/kik/f/a/a/a;

    invoke-virtual {v3, v0}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v13, "app-name"

    invoke-direct {v12, v0, v13}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "android"

    invoke-virtual {v12, v0}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    const-string v12, "iphone-uri"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    new-instance v12, Lcom/kik/f/a/a/a;

    invoke-virtual {v3, v0}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v13, "app-name"

    invoke-direct {v12, v0, v13}, Lcom/kik/f/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "iphone"

    invoke-virtual {v12, v0}, Lcom/kik/f/a/a/a;->a(Ljava/lang/String;)Lcom/kik/f/a/a/a;

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lkik/a/d/a/a;

    const-string v3, "2"

    new-instance v6, Ljava/util/Hashtable;

    invoke-direct {v6}, Ljava/util/Hashtable;-><init>()V

    invoke-direct/range {v0 .. v7}, Lkik/a/d/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/Hashtable;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    const-string v1, "icon"

    new-instance v2, Lkik/a/d/d;

    const v3, 0x7f0202f5

    invoke-static {v3}, Lkik/android/chat/KikApplication;->c(I)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lkik/android/f/a/f;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lkik/android/util/e;->a(Landroid/graphics/Bitmap;)[B

    move-result-object v3

    invoke-direct {v2, v3}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v0, v1, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    const-string v1, "app-pkg"

    const-string v2, "WebApp"

    invoke-virtual {v0, v1, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 63
    :cond_c
    invoke-virtual {v11}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v2, "kik.platform.send"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 64
    invoke-virtual {v11}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_d

    const-string v1, "com.kik.platform.content.EXTRA_CONVO_ID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->d:Ljava/lang/String;

    :cond_d
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    iget-object v1, p0, Lkik/android/chat/activity/KikPlatformLanding;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/f/a/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Lkik/android/f/a/f;->a(Landroid/app/Activity;Landroid/content/Intent;)Lkik/a/d/a/a;

    move-result-object v2

    invoke-static {v2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_e
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->getCallingPackage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    const-string v3, "camera"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    move v0, v10

    :goto_4
    if-nez v0, :cond_10

    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->finish()V

    goto/16 :goto_2

    :cond_f
    move v0, v9

    goto :goto_4

    :cond_10
    invoke-virtual {v2}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v0

    iget-object v3, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    invoke-virtual {v3, v2, v9, v8}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    const-string v3, "file-size"

    invoke-virtual {v2, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    cmp-long v2, v4, v2

    if-nez v2, :cond_11

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/32 v4, 0x989680

    cmp-long v0, v2, v4

    if-lez v0, :cond_12

    :cond_11
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0902e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0902bc

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f090193

    new-instance v2, Lkik/android/chat/activity/ak;

    invoke-direct {v2, p0}, Lkik/android/chat/activity/ak;-><init>(Lkik/android/chat/activity/KikPlatformLanding;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_2

    :cond_12
    invoke-direct {p0, v1}, Lkik/android/chat/activity/KikPlatformLanding;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_13
    invoke-direct {p0, v1}, Lkik/android/chat/activity/KikPlatformLanding;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 66
    :cond_14
    if-eqz v11, :cond_16

    const-string v0, "android.intent.action.SEND"

    invoke-virtual {v11}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v11}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v11}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v2, "image/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    move v0, v9

    :goto_5
    if-eqz v0, :cond_18

    .line 67
    invoke-static {v11}, Lkik/android/util/e;->a(Landroid/content/Intent;)Landroid/net/Uri;

    move-result-object v0

    .line 68
    if-eqz v0, :cond_15

    .line 69
    invoke-static {v0, p0}, Lkik/android/util/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 70
    if-nez v2, :cond_17

    .line 71
    const v0, 0x7f090134

    invoke-static {p0, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 77
    :cond_15
    :goto_6
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->finish()V

    goto/16 :goto_2

    :cond_16
    move v0, v10

    .line 66
    goto :goto_5

    .line 74
    :cond_17
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    const-string v3, "com.kik.ext.gallery"

    iget-object v6, p0, Lkik/android/chat/activity/KikPlatformLanding;->b:Lkik/a/e/v;

    move-object v1, p0

    move-object v4, v8

    move v5, v10

    invoke-virtual/range {v0 .. v6}, Lkik/android/f/a/f;->a(Landroid/app/Activity;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZLkik/a/e/v;)V

    goto :goto_6

    .line 79
    :cond_18
    if-eqz v11, :cond_19

    const-string v0, "android.intent.action.SEND"

    invoke-virtual {v11}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual {v11}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v11}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v2, "video/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    move v0, v9

    :goto_7
    if-eqz v0, :cond_1b

    .line 80
    invoke-static {v11}, Lkik/android/util/e;->a(Landroid/content/Intent;)Landroid/net/Uri;

    move-result-object v0

    .line 81
    if-eqz v0, :cond_1a

    .line 82
    iget-object v1, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    invoke-virtual {v1, v9}, Lkik/android/f/a/f;->a(Z)V

    .line 83
    new-instance v1, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    .line 84
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikConversationsFragment$a;

    .line 85
    invoke-static {v1, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 90
    :goto_8
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->finish()V

    goto/16 :goto_2

    :cond_19
    move v0, v10

    .line 79
    goto :goto_7

    .line 88
    :cond_1a
    const v0, 0x7f0900a0

    invoke-static {p0, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_8

    .line 92
    :cond_1b
    if-eqz v1, :cond_1c

    .line 93
    iget-object v0, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    invoke-virtual {v0, v1, v9, v8}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    .line 95
    invoke-direct {p0, v8}, Lkik/android/chat/activity/KikPlatformLanding;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 97
    :cond_1c
    invoke-virtual {v11}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {v11}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v11}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1d

    move v0, v9

    :goto_9
    if-eqz v0, :cond_1f

    .line 98
    invoke-virtual {v11}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 99
    const-string v1, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 100
    const-string v2, "android.intent.extra.TEXT"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 101
    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1e

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1e

    .line 102
    iget-object v2, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " - "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/android/f/a/f;->e(Ljava/lang/String;)V

    .line 107
    :goto_a
    invoke-direct {p0, v8}, Lkik/android/chat/activity/KikPlatformLanding;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1d
    move v0, v10

    .line 97
    goto :goto_9

    .line 105
    :cond_1e
    iget-object v1, p0, Lkik/android/chat/activity/KikPlatformLanding;->e:Lkik/android/f/a/f;

    invoke-virtual {v1, v0}, Lkik/android/f/a/f;->e(Ljava/lang/String;)V

    goto :goto_a

    .line 110
    :cond_1f
    const v0, 0x7f0900ae

    invoke-static {p0, v0, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 111
    invoke-virtual {p0}, Lkik/android/chat/activity/KikPlatformLanding;->finish()V

    goto/16 :goto_2

    :cond_20
    move-object v0, v8

    goto/16 :goto_0

    :cond_21
    move-object v1, v8

    goto/16 :goto_1
.end method
