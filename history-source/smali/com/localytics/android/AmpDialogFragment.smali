.class public Lcom/localytics/android/AmpDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "AmpDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/AmpDialogFragment$AmpDialog;
    }
.end annotation


# static fields
.field public static final CLOSE_BUTTON_ID:I = 0x1

.field public static final DIALOG_TAG:Ljava/lang/String; = "amp_dialog"

.field private static final OPENING_EXTERNAL:I = 0x2

.field private static final OPENING_INTERNAL:I = 0x1

.field private static final PROTOCOL_UNMATCHED:I = -0x1

.field private static final PROTOCOL_UNRECOGNIZED:I = -0x2

.field private static sDismissButtonImage:Landroid/graphics/Bitmap;


# instance fields
.field private mAmpDialog:Lcom/localytics/android/AmpDialogFragment$AmpDialog;

.field private mAmpMessage:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mCallbacks:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;"
        }
    .end annotation
.end field

.field private mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mExitAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mJavaScriptClient:Lcom/localytics/android/JavaScriptClient;

.field private mUploadedViewEvent:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 114
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 115
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 116
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mExitAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mUploadedViewEvent:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 118
    return-void
.end method

.method static synthetic access$000(Lcom/localytics/android/AmpDialogFragment;)Lcom/localytics/android/AmpDialogFragment$AmpDialog;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpDialog:Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    return-object v0
.end method

.method static synthetic access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$300(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mExitAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$400(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic access$500(Lcom/localytics/android/AmpDialogFragment;)Lcom/localytics/android/JavaScriptClient;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment;

    .prologue
    .line 62
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mJavaScriptClient:Lcom/localytics/android/JavaScriptClient;

    return-object v0
.end method

.method static synthetic access$900()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/localytics/android/AmpDialogFragment;->sDismissButtonImage:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private getValueByQueryKey(Ljava/lang/String;Ljava/net/URI;)Ljava/lang/String;
    .locals 11
    .param p1, "queryKey"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/net/URI;

    .prologue
    const/4 v8, 0x0

    .line 442
    invoke-virtual {p2}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v7

    .line 444
    .local v7, "query":Ljava/lang/String;
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 469
    :cond_0
    :goto_0
    return-object v8

    .line 449
    :cond_1
    invoke-virtual {p2}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    move-result-object v9

    const-string v10, "[&]"

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 450
    .local v6, "pairs":[Ljava/lang/String;
    move-object v0, v6

    .local v0, "arr$":[Ljava/lang/String;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_0

    aget-object v5, v0, v3

    .line 452
    .local v5, "pair":Ljava/lang/String;
    const-string v9, "[=]"

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 453
    .local v1, "components":[Ljava/lang/String;
    const/4 v9, 0x0

    aget-object v9, v1, v9

    invoke-virtual {v9, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v9

    if-nez v9, :cond_2

    .line 455
    const/4 v9, 0x2

    array-length v10, v1

    if-ne v9, v10, :cond_2

    .line 459
    const/4 v9, 0x1

    :try_start_0
    aget-object v9, v1, v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    goto :goto_0

    .line 461
    :catch_0
    move-exception v2

    .line 463
    .local v2, "e":Ljava/io/UnsupportedEncodingException;
    goto :goto_0

    .line 450
    .end local v2    # "e":Ljava/io/UnsupportedEncodingException;
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1
.end method

.method private getValueByQueryKey(Ljava/lang/String;Ljava/net/URL;)Ljava/lang/String;
    .locals 2
    .param p1, "queryKey"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/net/URL;

    .prologue
    .line 432
    :try_start_0
    invoke-virtual {p2}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/localytics/android/AmpDialogFragment;->getValueByQueryKey(Ljava/lang/String;Ljava/net/URI;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 436
    :goto_0
    return-object v1

    .line 434
    :catch_0
    move-exception v0

    .line 436
    .local v0, "e":Ljava/net/URISyntaxException;
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private handleCustomProtocolRequest(Ljava/lang/String;Landroid/app/Activity;)I
    .locals 4
    .param p1, "urlString"    # Ljava/lang/String;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    .line 1170
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1171
    .local v1, "intent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpDialog:Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    invoke-virtual {v2}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 1172
    .local v0, "activities":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 1174
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 1176
    const-string v2, "Localytics"

    const-string v3, "[AMP Nav Handler]: An app on this device is registered to handle this protocol scheme. Opening..."

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1178
    :cond_0
    const/high16 v2, 0x20000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1179
    invoke-virtual {p2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1180
    const/4 v2, 0x2

    .line 1183
    :goto_0
    return v2

    :cond_1
    const/4 v2, -0x2

    goto :goto_0
.end method

.method private handleCustomProtocolRequest(Ljava/net/URL;Landroid/app/Activity;)I
    .locals 1
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    .line 1165
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/localytics/android/AmpDialogFragment;->handleCustomProtocolRequest(Ljava/lang/String;Landroid/app/Activity;)I

    move-result v0

    return v0
.end method

.method private handleFileProtocolRequest(Ljava/net/URL;)I
    .locals 3
    .param p1, "url"    # Ljava/net/URL;

    .prologue
    .line 1110
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1112
    const/4 v0, -0x1

    .line 1120
    :goto_0
    return v0

    .line 1115
    :cond_0
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_1

    .line 1117
    const-string v0, "Localytics"

    const-string v1, "[AMP Nav Handler]: Displaying content from your local creatives."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1120
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private handleHttpProtocolRequest(Ljava/net/URL;Landroid/app/Activity;)I
    .locals 10
    .param p1, "url"    # Ljava/net/URL;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v4, 0x1

    const/4 v9, 0x0

    .line 1125
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    .line 1126
    .local v3, "protocol":Ljava/lang/String;
    const-string v5, "http"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "https"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 1128
    const/4 v4, -0x1

    .line 1160
    :cond_0
    :goto_0
    return v4

    .line 1131
    :cond_1
    sget-boolean v5, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v5, :cond_2

    .line 1133
    const-string v5, "Localytics"

    const-string v6, "[AMP Nav Handler]: Handling a request for an external HTTP address."

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1137
    :cond_2
    const-string v5, "ampExternalOpen"

    invoke-direct {p0, v5, p1}, Lcom/localytics/android/AmpDialogFragment;->getValueByQueryKey(Ljava/lang/String;Ljava/net/URL;)Ljava/lang/String;

    move-result-object v2

    .line 1138
    .local v2, "openExternalValue":Ljava/lang/String;
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "true"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1140
    sget-boolean v5, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v5, :cond_3

    .line 1142
    const-string v5, "Localytics"

    const-string v6, "[AMP Nav Handler]: Query string hook [%s] set to true. Opening the URL in chrome"

    new-array v7, v4, [Ljava/lang/Object;

    const-string v8, "ampExternalOpen"

    aput-object v8, v7, v9

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1145
    :cond_3
    new-instance v1, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-direct {v1, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1146
    .local v1, "intent":Landroid/content/Intent;
    iget-object v5, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpDialog:Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    invoke-virtual {v5}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, v1, v9}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 1147
    .local v0, "activities":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_4

    .line 1149
    invoke-virtual {p2, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1150
    const/4 v4, 0x2

    goto :goto_0

    .line 1155
    .end local v0    # "activities":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    .end local v1    # "intent":Landroid/content/Intent;
    :cond_4
    sget-boolean v5, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v5, :cond_0

    .line 1157
    const-string v5, "Localytics"

    const-string v6, "[AMP Nav Handler]: Loading HTTP request inside the current AMP view"

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static newInstance()Lcom/localytics/android/AmpDialogFragment;
    .locals 2

    .prologue
    .line 268
    new-instance v0, Lcom/localytics/android/AmpDialogFragment;

    invoke-direct {v0}, Lcom/localytics/android/AmpDialogFragment;-><init>()V

    .line 269
    .local v0, "fragment":Lcom/localytics/android/AmpDialogFragment;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpDialogFragment;->setRetainInstance(Z)V

    .line 270
    return-object v0
.end method

.method public static setDismissButtonImage(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p0, "image"    # Landroid/graphics/Bitmap;

    .prologue
    .line 351
    sget-object v0, Lcom/localytics/android/AmpDialogFragment;->sDismissButtonImage:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 353
    sget-object v0, Lcom/localytics/android/AmpDialogFragment;->sDismissButtonImage:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 355
    :cond_0
    sput-object p0, Lcom/localytics/android/AmpDialogFragment;->sDismissButtonImage:Landroid/graphics/Bitmap;

    .line 356
    return-void
.end method

.method private tagAmpActionEventWithAction(Ljava/lang/String;)V
    .locals 12
    .param p1, "action"    # Ljava/lang/String;

    .prologue
    const/4 v11, 0x2

    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 384
    iget-object v6, p0, Lcom/localytics/android/AmpDialogFragment;->mUploadedViewEvent:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 386
    sget-boolean v6, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v6, :cond_0

    .line 388
    const-string v6, "Localytics"

    const-string v7, "The AMP action for this message has already been set. Ignoring AMP Action: [%s]"

    new-array v8, v9, [Ljava/lang/Object;

    aput-object p1, v8, v10

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    :cond_0
    :goto_0
    return-void

    .line 394
    :cond_1
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 395
    .local v1, "attributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v6, "ampAction"

    invoke-virtual {v1, v6, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    const-string v6, "ampCampaignId"

    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    const-string v8, "campaign_id"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    const-string v6, "ampCampaign"

    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    const-string v8, "rule_name"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    iget-object v6, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    const-string v7, "ab_test"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 400
    .local v0, "ab":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 402
    const-string v6, "ampAB"

    invoke-virtual {v1, v6, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    :cond_2
    invoke-static {}, Lcom/localytics/android/LocalyticsAmpSession;->isTestModeEnabled()Z

    move-result v6

    if-nez v6, :cond_0

    .line 408
    iget-object v6, p0, Lcom/localytics/android/AmpDialogFragment;->mCallbacks:Ljava/util/Map;

    if-eqz v6, :cond_0

    .line 409
    iget-object v6, p0, Lcom/localytics/android/AmpDialogFragment;->mCallbacks:Ljava/util/Map;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/localytics/android/AmpCallable;

    .line 410
    .local v3, "callable":Lcom/localytics/android/AmpCallable;
    if-eqz v3, :cond_3

    .line 412
    new-array v6, v11, [Ljava/lang/Object;

    const-string v7, "ampView"

    aput-object v7, v6, v10

    aput-object v1, v6, v9

    invoke-virtual {v3, v6}, Lcom/localytics/android/AmpCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    :cond_3
    sget-boolean v6, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v6, :cond_0

    .line 417
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 418
    .local v2, "builder":Ljava/lang/StringBuilder;
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 420
    .local v4, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Key = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", Value = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 422
    .end local v4    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_4
    const-string v6, "Localytics"

    const-string v7, "AMP event tagged successfully.\n   Attributes Dictionary = \n%s"

    new-array v8, v9, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v10

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method

.method private tagAmpActionForURL(Ljava/net/URI;)V
    .locals 6
    .param p1, "url"    # Ljava/net/URI;

    .prologue
    .line 361
    const-string v2, "ampAction"

    invoke-direct {p0, v2, p1}, Lcom/localytics/android/AmpDialogFragment;->getValueByQueryKey(Ljava/lang/String;Ljava/net/URI;)Ljava/lang/String;

    move-result-object v0

    .line 362
    .local v0, "ampActionValue":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 364
    sget-boolean v2, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v2, :cond_0

    .line 366
    const-string v2, "Localytics"

    const-string v3, "Attempting to tag event with custom AMP action.[Action: %s]"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 368
    :cond_0
    invoke-direct {p0, v0}, Lcom/localytics/android/AmpDialogFragment;->tagAmpActionEventWithAction(Ljava/lang/String;)V

    .line 380
    :cond_1
    :goto_0
    return-void

    .line 374
    :cond_2
    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    .line 375
    .local v1, "protocol":Ljava/lang/String;
    const-string v2, "file"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "https"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 377
    const-string v2, "click"

    invoke-direct {p0, v2}, Lcom/localytics/android/AmpDialogFragment;->tagAmpActionEventWithAction(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method handleUrl(Ljava/lang/String;Landroid/app/Activity;)Z
    .locals 12
    .param p1, "urlString"    # Ljava/lang/String;
    .param p2, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v11, 0x2

    .line 1028
    move-object v3, p1

    .line 1030
    .local v3, "url":Ljava/lang/String;
    sget-boolean v6, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v6, :cond_0

    .line 1032
    const-string v6, "Localytics"

    const-string v7, "[AMP Nav Handler]: Evaluating AMP URL:\n\tURL:%s"

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v3, v8, v5

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1035
    :cond_0
    const/4 v2, 0x0

    .line 1038
    .local v2, "result":I
    :try_start_0
    const-string v6, "://"

    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 1040
    const/4 v6, 0x0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    invoke-virtual {v3, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1044
    :cond_1
    new-instance v6, Ljava/net/URI;

    invoke-direct {v6, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v6}, Lcom/localytics/android/AmpDialogFragment;->tagAmpActionForURL(Ljava/net/URI;)V

    .line 1050
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 1053
    .local v0, "aURL":Ljava/net/URL;
    invoke-direct {p0, v0}, Lcom/localytics/android/AmpDialogFragment;->handleFileProtocolRequest(Ljava/net/URL;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-lez v2, :cond_4

    .line 1055
    if-ne v2, v11, :cond_3

    .line 1091
    :goto_0
    if-ne v2, v11, :cond_2

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    .line 1097
    .end local v0    # "aURL":Ljava/net/URL;
    :cond_2
    :goto_1
    return v4

    .restart local v0    # "aURL":Ljava/net/URL;
    :cond_3
    move v4, v5

    .line 1055
    goto :goto_0

    .line 1059
    :cond_4
    :try_start_1
    invoke-direct {p0, v0, p2}, Lcom/localytics/android/AmpDialogFragment;->handleHttpProtocolRequest(Ljava/net/URL;Landroid/app/Activity;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-lez v2, :cond_6

    .line 1061
    if-ne v2, v11, :cond_5

    .line 1091
    :goto_2
    if-ne v2, v11, :cond_2

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    goto :goto_1

    :cond_5
    move v4, v5

    .line 1061
    goto :goto_2

    .line 1065
    :cond_6
    :try_start_2
    invoke-direct {p0, v0, p2}, Lcom/localytics/android/AmpDialogFragment;->handleCustomProtocolRequest(Ljava/net/URL;Landroid/app/Activity;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v2

    if-lez v2, :cond_8

    .line 1067
    if-ne v2, v11, :cond_7

    .line 1091
    :goto_3
    if-ne v2, v11, :cond_2

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    goto :goto_1

    :cond_7
    move v4, v5

    .line 1067
    goto :goto_3

    .line 1070
    :cond_8
    :try_start_3
    sget-boolean v6, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v6, :cond_9

    .line 1072
    const-string v6, "Localytics"

    const-string v7, "[AMP Nav Handler]: Protocol handler scheme not recognized. Attempting to load the URL... [Scheme: %s]"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1091
    :cond_9
    if-ne v2, v11, :cond_a

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    .end local v0    # "aURL":Ljava/net/URL;
    :cond_a
    :goto_4
    move v4, v5

    .line 1097
    goto :goto_1

    .line 1075
    :catch_0
    move-exception v1

    .line 1078
    .local v1, "e":Ljava/lang/Exception;
    :try_start_4
    invoke-direct {p0, v3, p2}, Lcom/localytics/android/AmpDialogFragment;->handleCustomProtocolRequest(Ljava/lang/String;Landroid/app/Activity;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v2

    if-lez v2, :cond_c

    .line 1080
    if-ne v2, v11, :cond_b

    .line 1091
    :goto_5
    if-ne v2, v11, :cond_2

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    goto :goto_1

    :cond_b
    move v4, v5

    .line 1080
    goto :goto_5

    .line 1083
    :cond_c
    :try_start_5
    sget-boolean v4, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v4, :cond_d

    .line 1085
    const-string v4, "Localytics"

    const-string v6, "[AMP Nav Handler]: Invalid url %s"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object p1, v7, v8

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1087
    :cond_d
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1091
    if-ne v2, v11, :cond_a

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    goto :goto_4

    .line 1091
    .end local v1    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v4

    if-ne v2, v11, :cond_e

    .line 1093
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    :cond_e
    throw v4
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    .line 123
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 125
    const-string v0, "AmpDialogFragment"

    const-string v1, "onActivityCreated"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 128
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 133
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 135
    const-string v0, "AmpDialogFragment"

    const-string v1, "onAttach"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 138
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 143
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 145
    const-string v0, "AmpDialogFragment"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 148
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 276
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 278
    const-string v0, "AmpDialogFragment"

    const-string v1, "onCreateDialog"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    :cond_0
    new-instance v0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x103000b

    invoke-direct {v0, p0, v1, v2}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;-><init>(Lcom/localytics/android/AmpDialogFragment;Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpDialog:Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 256
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 258
    const-string v0, "AmpDialogFragment"

    const-string v1, "onCreateView"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/DialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 207
    sget-boolean v1, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v1, :cond_0

    .line 209
    const-string v1, "AmpDialogFragment"

    const-string v2, "onDestroy"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    :cond_0
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment;->mCallbacks:Ljava/util/Map;

    if-eqz v1, :cond_1

    .line 213
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment;->mCallbacks:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/localytics/android/AmpCallable;

    .line 214
    .local v0, "callable":Lcom/localytics/android/AmpCallable;
    invoke-static {}, Lcom/localytics/android/AmpConstants;->isTestModeEnabled()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    .line 216
    new-array v1, v3, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/localytics/android/AmpCallable;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .end local v0    # "callable":Lcom/localytics/android/AmpCallable;
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 220
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 286
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 288
    const-string v0, "AmpDialogFragment"

    const-string v1, "onDestroyView"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    :cond_0
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->getRetainInstance()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 292
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 294
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroyView()V

    .line 295
    return-void
.end method

.method public onDetach()V
    .locals 2

    .prologue
    .line 153
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 155
    const-string v0, "AmpDialogFragment"

    const-string v1, "onDetach"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDetach()V

    .line 158
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 163
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 165
    const-string v0, "AmpDialogFragment"

    const-string v1, "onDismiss"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 169
    const-string v0, "X"

    invoke-direct {p0, v0}, Lcom/localytics/android/AmpDialogFragment;->tagAmpActionEventWithAction(Ljava/lang/String;)V

    .line 171
    :cond_1
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 172
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 187
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 189
    const-string v0, "AmpDialogFragment"

    const-string v1, "onPause"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onPause()V

    .line 192
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 197
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 199
    const-string v0, "AmpDialogFragment"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onResume()V

    .line 202
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "arg0"    # Landroid/os/Bundle;

    .prologue
    .line 245
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 247
    const-string v0, "AmpDialogFragment"

    const-string v1, "onSaveInstanceState"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 250
    return-void
.end method

.method public onStart()V
    .locals 2

    .prologue
    .line 177
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 179
    const-string v0, "AmpDialogFragment"

    const-string v1, "onStart"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStart()V

    .line 182
    return-void
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 225
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 227
    const-string v0, "AmpDialogFragment"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onStop()V

    .line 230
    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 235
    sget-boolean v0, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v0, :cond_0

    .line 237
    const-string v0, "AmpDialogFragment"

    const-string v1, "onViewStateRestored"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 239
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onViewStateRestored(Landroid/os/Bundle;)V

    .line 240
    return-void
.end method

.method public setCallbacks(Ljava/util/Map;)Lcom/localytics/android/AmpDialogFragment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/localytics/android/AmpCallable;",
            ">;)",
            "Lcom/localytics/android/AmpDialogFragment;"
        }
    .end annotation

    .prologue
    .line 345
    .local p1, "callbacks":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Lcom/localytics/android/AmpCallable;>;"
    iput-object p1, p0, Lcom/localytics/android/AmpDialogFragment;->mCallbacks:Ljava/util/Map;

    .line 346
    return-object p0
.end method

.method public setData(Ljava/util/Map;)Lcom/localytics/android/AmpDialogFragment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/localytics/android/AmpDialogFragment;"
        }
    .end annotation

    .prologue
    .line 299
    .local p1, "ampMessage":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    iput-object p1, p0, Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;

    .line 300
    return-object p0
.end method

.method public setJavaScriptClient(Lcom/localytics/android/JavaScriptClient;)Lcom/localytics/android/AmpDialogFragment;
    .locals 3
    .param p1, "javaScriptClient"    # Lcom/localytics/android/JavaScriptClient;

    .prologue
    .line 305
    iput-object p1, p0, Lcom/localytics/android/AmpDialogFragment;->mJavaScriptClient:Lcom/localytics/android/JavaScriptClient;

    .line 306
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment;->mJavaScriptClient:Lcom/localytics/android/JavaScriptClient;

    invoke-virtual {v1}, Lcom/localytics/android/JavaScriptClient;->getCallbacks()Ljava/util/Map;

    move-result-object v0

    .line 308
    .local v0, "callbacks":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Lcom/localytics/android/AmpCallable;>;"
    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/localytics/android/AmpDialogFragment$1;

    invoke-direct {v2, p0}, Lcom/localytics/android/AmpDialogFragment$1;-><init>(Lcom/localytics/android/AmpDialogFragment;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/localytics/android/AmpDialogFragment$2;

    invoke-direct {v2, p0}, Lcom/localytics/android/AmpDialogFragment$2;-><init>(Lcom/localytics/android/AmpDialogFragment;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    return-object p0
.end method
