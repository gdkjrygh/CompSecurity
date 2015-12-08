.class public Lcom/facebook/internal/LikeActionController;
.super Ljava/lang/Object;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;,
        Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;,
        Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;,
        Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;,
        Lcom/facebook/internal/LikeActionController$LikeDialogFeature;,
        Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;,
        Lcom/facebook/internal/LikeActionController$CreationCallback;
    }
.end annotation


# static fields
.field public static final ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.DID_ERROR"

.field public static final ACTION_LIKE_ACTION_CONTROLLER_DID_RESET:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.DID_RESET"

.field public static final ACTION_LIKE_ACTION_CONTROLLER_UPDATED:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.UPDATED"

.field public static final ACTION_OBJECT_ID_KEY:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.OBJECT_ID"

.field private static final ERROR_CODE_OBJECT_ALREADY_LIKED:I = 0xdad

.field public static final ERROR_INVALID_OBJECT_ID:Ljava/lang/String; = "Invalid Object Id"

.field private static final JSON_BOOL_IS_OBJECT_LIKED_KEY:Ljava/lang/String; = "is_object_liked"

.field private static final JSON_BUNDLE_PENDING_CALL_ANALYTICS_BUNDLE:Ljava/lang/String; = "pending_call_analytics_bundle"

.field private static final JSON_INT_VERSION_KEY:Ljava/lang/String; = "com.facebook.internal.LikeActionController.version"

.field private static final JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY:Ljava/lang/String; = "like_count_string_without_like"

.field private static final JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY:Ljava/lang/String; = "like_count_string_with_like"

.field private static final JSON_STRING_OBJECT_ID_KEY:Ljava/lang/String; = "object_id"

.field private static final JSON_STRING_PENDING_CALL_ID_KEY:Ljava/lang/String; = "pending_call_id"

.field private static final JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY:Ljava/lang/String; = "social_sentence_without_like"

.field private static final JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY:Ljava/lang/String; = "social_sentence_with_like"

.field private static final JSON_STRING_UNLIKE_TOKEN_KEY:Ljava/lang/String; = "unlike_token"

.field private static final LIKE_ACTION_CONTROLLER_STORE:Ljava/lang/String; = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

.field private static final LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY:Ljava/lang/String; = "OBJECT_SUFFIX"

.field private static final LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY:Ljava/lang/String; = "PENDING_CONTROLLER_KEY"

.field private static final LIKE_ACTION_CONTROLLER_VERSION:I = 0x2

.field private static final LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY:Ljava/lang/String; = "like_count_string"

.field private static final LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY:Ljava/lang/String; = "object_is_liked"

.field private static final LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY:Ljava/lang/String; = "social_sentence"

.field private static final LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY:Ljava/lang/String; = "unlike_token"

.field private static final MAX_CACHE_SIZE:I = 0x80

.field private static final MAX_OBJECT_SUFFIX:I = 0x3e8

.field private static final TAG:Ljava/lang/String;

.field private static final cache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/LikeActionController;",
            ">;"
        }
    .end annotation
.end field

.field private static controllerDiskCache:Lcom/facebook/internal/FileLruCache;

.field private static diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

.field private static handler:Landroid/os/Handler;

.field private static isInitialized:Z

.field private static isPendingBroadcastReset:Z

.field private static mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

.field private static objectIdForPendingController:Ljava/lang/String;

.field private static volatile objectSuffix:I


# instance fields
.field private appEventsLogger:Lcom/facebook/AppEventsLogger;

.field private context:Landroid/content/Context;

.field private isObjectLiked:Z

.field private isObjectLikedOnServer:Z

.field private isPendingLikeOrUnlike:Z

.field private likeCountStringWithLike:Ljava/lang/String;

.field private likeCountStringWithoutLike:Ljava/lang/String;

.field private objectId:Ljava/lang/String;

.field private objectIsPage:Z

.field private pendingCallAnalyticsBundle:Landroid/os/Bundle;

.field private pendingCallId:Ljava/util/UUID;

.field private session:Lcom/facebook/Session;

.field private socialSentenceWithLike:Ljava/lang/String;

.field private socialSentenceWithoutLike:Ljava/lang/String;

.field private unlikeToken:Ljava/lang/String;

.field private verifiedObjectId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 55
    const-class v0, Lcom/facebook/internal/LikeActionController;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    .line 86
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    new-instance v0, Lcom/facebook/internal/WorkQueue;

    invoke-direct {v0, v1}, Lcom/facebook/internal/WorkQueue;-><init>(I)V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

    .line 89
    new-instance v0, Lcom/facebook/internal/WorkQueue;

    invoke-direct {v0, v1}, Lcom/facebook/internal/WorkQueue;-><init>(I)V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "session"    # Lcom/facebook/Session;
    .param p3, "objectId"    # Ljava/lang/String;

    .prologue
    .line 518
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 519
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    .line 520
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    .line 521
    iput-object p3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    .line 523
    invoke-static {p1, p2}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    .line 524
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/internal/LikeActionController;IILandroid/content/Intent;Ljava/util/UUID;)Z
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # I
    .param p2, "x2"    # I
    .param p3, "x3"    # Landroid/content/Intent;
    .param p4, "x4"    # Ljava/util/UUID;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/internal/LikeActionController;->onActivityResult(IILandroid/content/Intent;Ljava/util/UUID;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/facebook/internal/LikeActionController;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->refreshStatusAsync()V

    return-void
.end method

.method static synthetic access$1000(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1202(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/facebook/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Z
    .param p2, "x2"    # Ljava/lang/String;
    .param p3, "x3"    # Ljava/lang/String;
    .param p4, "x4"    # Ljava/lang/String;
    .param p5, "x5"    # Ljava/lang/String;
    .param p6, "x6"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-direct/range {p0 .. p6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1500()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Landroid/os/Bundle;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/facebook/internal/LikeActionController;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1800(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .param p0, "x0"    # Landroid/content/Context;
    .param p1, "x1"    # Lcom/facebook/internal/LikeActionController;
    .param p2, "x2"    # Ljava/lang/String;
    .param p3, "x3"    # Landroid/os/Bundle;

    .prologue
    .line 45
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1902(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200()Z
    .locals 1

    .prologue
    .line 45
    sget-boolean v0, Lcom/facebook/internal/LikeActionController;->isPendingBroadcastReset:Z

    return v0
.end method

.method static synthetic access$2002(Lcom/facebook/internal/LikeActionController;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Z

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    return p1
.end method

.method static synthetic access$202(Z)Z
    .locals 0
    .param p0, "x0"    # Z

    .prologue
    .line 45
    sput-boolean p0, Lcom/facebook/internal/LikeActionController;->isPendingBroadcastReset:Z

    return p0
.end method

.method static synthetic access$2100(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Landroid/app/Activity;
    .param p2, "x2"    # Landroid/os/Bundle;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$2202(Lcom/facebook/internal/LikeActionController;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Z

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLikedOnServer:Z

    return p1
.end method

.method static synthetic access$2300(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Landroid/app/Activity;
    .param p2, "x2"    # Landroid/os/Bundle;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->toggleAgainIfNeeded(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$2400(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2502(Lcom/facebook/internal/LikeActionController;Z)Z
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Z

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->objectIsPage:Z

    return p1
.end method

.method static synthetic access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    .locals 0
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Lcom/facebook/FacebookRequestError;

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    return-void
.end method

.method static synthetic access$2700(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/Session;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    return-object v0
.end method

.method static synthetic access$2800(Lcom/facebook/internal/LikeActionController;)Z
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    return v0
.end method

.method static synthetic access$2900(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/String;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-static {p0, p1}, Lcom/facebook/internal/LikeActionController;->serializeToDiskSynchronously(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300()I
    .locals 1

    .prologue
    .line 45
    sget v0, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    return v0
.end method

.method static synthetic access$3000(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 0
    .param p0, "x0"    # Landroid/content/Context;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Lcom/facebook/internal/LikeActionController$CreationCallback;

    .prologue
    .line 45
    invoke-static {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->createControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    return-void
.end method

.method static synthetic access$302(I)I
    .locals 0
    .param p0, "x0"    # I

    .prologue
    .line 45
    sput p0, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    return p0
.end method

.method static synthetic access$400()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic access$500()Lcom/facebook/internal/FileLruCache;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    return-object v0
.end method

.method static synthetic access$600(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Landroid/content/Context;
    .param p1, "x1"    # Lcom/facebook/internal/LikeActionController;
    .param p2, "x2"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-static {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$700()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$800(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    return-object v0
.end method

.method private static broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "controller"    # Lcom/facebook/internal/LikeActionController;
    .param p2, "action"    # Ljava/lang/String;

    .prologue
    .line 496
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 497
    return-void
.end method

.method private static broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "controller"    # Lcom/facebook/internal/LikeActionController;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "data"    # Landroid/os/Bundle;

    .prologue
    .line 500
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 501
    .local v0, "broadcastIntent":Landroid/content/Intent;
    if-eqz p1, :cond_1

    .line 502
    if-nez p3, :cond_0

    .line 503
    new-instance p3, Landroid/os/Bundle;

    .end local p3    # "data":Landroid/os/Bundle;
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 506
    .restart local p3    # "data":Landroid/os/Bundle;
    :cond_0
    const-string v1, "com.facebook.sdk.LikeActionController.OBJECT_ID"

    invoke-virtual {p1}, Lcom/facebook/internal/LikeActionController;->getObjectId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    :cond_1
    if-eqz p3, :cond_2

    .line 510
    invoke-virtual {v0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 512
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 513
    return-void
.end method

.method private canUseOGPublish(Z)Z
    .locals 2
    .param p1, "willPerformLike"    # Z

    .prologue
    .line 774
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->objectIsPage:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    .line 777
    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    .line 778
    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v0

    const-string v1, "publish_actions"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    .line 779
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static createControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "objectId"    # Ljava/lang/String;
    .param p2, "callback"    # Lcom/facebook/internal/LikeActionController$CreationCallback;

    .prologue
    .line 201
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;

    move-result-object v0

    .line 202
    .local v0, "controllerForObject":Lcom/facebook/internal/LikeActionController;
    if-eqz v0, :cond_0

    .line 204
    invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    .line 229
    :goto_0
    return-void

    .line 209
    :cond_0
    invoke-static {p0, p1}, Lcom/facebook/internal/LikeActionController;->deserializeFromDiskSynchronously(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;

    move-result-object v0

    .line 211
    if-nez v0, :cond_1

    .line 212
    new-instance v0, Lcom/facebook/internal/LikeActionController;

    .end local v0    # "controllerForObject":Lcom/facebook/internal/LikeActionController;
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v2

    invoke-direct {v0, p0, v2, p1}, Lcom/facebook/internal/LikeActionController;-><init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V

    .line 213
    .restart local v0    # "controllerForObject":Lcom/facebook/internal/LikeActionController;
    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V

    .line 217
    :cond_1
    invoke-static {p1, v0}, Lcom/facebook/internal/LikeActionController;->putControllerInMemoryCache(Ljava/lang/String;Lcom/facebook/internal/LikeActionController;)V

    .line 220
    move-object v1, v0

    .line 221
    .local v1, "controllerToRefresh":Lcom/facebook/internal/LikeActionController;
    sget-object v2, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    new-instance v3, Lcom/facebook/internal/LikeActionController$2;

    invoke-direct {v3, v1}, Lcom/facebook/internal/LikeActionController$2;-><init>(Lcom/facebook/internal/LikeActionController;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 228
    invoke-static {p2, v1}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    goto :goto_0
.end method

.method private static deserializeFromDiskSynchronously(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    .locals 7
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "objectId"    # Ljava/lang/String;

    .prologue
    .line 380
    const/4 v1, 0x0

    .line 382
    .local v1, "controller":Lcom/facebook/internal/LikeActionController;
    const/4 v4, 0x0

    .line 384
    .local v4, "inputStream":Ljava/io/InputStream;
    :try_start_0
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 385
    .local v0, "cacheKey":Ljava/lang/String;
    sget-object v5, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    invoke-virtual {v5, v0}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4

    .line 386
    if-eqz v4, :cond_0

    .line 387
    invoke-static {v4}, Lcom/facebook/internal/Utility;->readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v2

    .line 388
    .local v2, "controllerJsonString":Ljava/lang/String;
    invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 389
    invoke-static {p0, v2}, Lcom/facebook/internal/LikeActionController;->deserializeFromJson(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 396
    .end local v2    # "controllerJsonString":Ljava/lang/String;
    :cond_0
    if-eqz v4, :cond_1

    .line 397
    invoke-static {v4}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 401
    .end local v0    # "cacheKey":Ljava/lang/String;
    :cond_1
    :goto_0
    return-object v1

    .line 392
    :catch_0
    move-exception v3

    .line 393
    .local v3, "e":Ljava/io/IOException;
    :try_start_1
    sget-object v5, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v6, "Unable to deserialize controller from disk"

    invoke-static {v5, v6, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 394
    const/4 v1, 0x0

    .line 396
    if-eqz v4, :cond_1

    .line 397
    invoke-static {v4}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 396
    .end local v3    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v5

    if-eqz v4, :cond_2

    .line 397
    invoke-static {v4}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    :cond_2
    throw v5
.end method

.method private static deserializeFromJson(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    .locals 8
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "controllerJsonString"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 408
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 409
    .local v2, "controllerJson":Lorg/json/JSONObject;
    const-string v6, "com.facebook.internal.LikeActionController.version"

    const/4 v7, -0x1

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    .line 410
    .local v5, "version":I
    const/4 v6, 0x2

    if-eq v5, v6, :cond_1

    .line 441
    .end local v2    # "controllerJson":Lorg/json/JSONObject;
    .end local v5    # "version":I
    :cond_0
    :goto_0
    return-object v1

    .line 415
    .restart local v2    # "controllerJson":Lorg/json/JSONObject;
    .restart local v5    # "version":I
    :cond_1
    new-instance v1, Lcom/facebook/internal/LikeActionController;

    .line 417
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v6

    const-string v7, "object_id"

    .line 418
    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v1, p0, v6, v7}, Lcom/facebook/internal/LikeActionController;-><init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V

    .line 421
    .local v1, "controller":Lcom/facebook/internal/LikeActionController;
    const-string v6, "like_count_string_with_like"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    .line 422
    const-string v6, "like_count_string_without_like"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    .line 423
    const-string v6, "social_sentence_with_like"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    .line 424
    const-string v6, "social_sentence_without_like"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    .line 425
    const-string v6, "is_object_liked"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, v1, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    .line 426
    const-string v6, "unlike_token"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    .line 427
    const-string v6, "pending_call_id"

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 428
    .local v4, "pendingCallIdString":Ljava/lang/String;
    invoke-static {v4}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 429
    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    .line 432
    :cond_2
    const-string v6, "pending_call_analytics_bundle"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 433
    .local v0, "analyticsJSON":Lorg/json/JSONObject;
    if-eqz v0, :cond_0

    .line 434
    invoke-static {v0}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v6

    iput-object v6, v1, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 436
    .end local v0    # "analyticsJSON":Lorg/json/JSONObject;
    .end local v1    # "controller":Lcom/facebook/internal/LikeActionController;
    .end local v2    # "controllerJson":Lorg/json/JSONObject;
    .end local v4    # "pendingCallIdString":Ljava/lang/String;
    .end local v5    # "version":I
    :catch_0
    move-exception v3

    .line 437
    .local v3, "e":Lorg/json/JSONException;
    sget-object v6, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v7, "Unable to deserialize controller from JSON"

    invoke-static {v6, v7, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 438
    const/4 v1, 0x0

    .restart local v1    # "controller":Lcom/facebook/internal/LikeActionController;
    goto :goto_0
.end method

.method private fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
    .locals 4
    .param p1, "completionHandler"    # Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;

    .prologue
    .line 989
    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 990
    if-eqz p1, :cond_0

    .line 991
    invoke-interface {p1}, Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;->onComplete()V

    .line 1028
    :cond_0
    :goto_0
    return-void

    .line 997
    :cond_1
    new-instance v0, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v0, p0, v3}, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 998
    .local v0, "objectIdRequest":Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;
    new-instance v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v1, p0, v3}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 1000
    .local v1, "pageIdRequest":Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
    new-instance v2, Lcom/facebook/RequestBatch;

    invoke-direct {v2}, Lcom/facebook/RequestBatch;-><init>()V

    .line 1001
    .local v2, "requestBatch":Lcom/facebook/RequestBatch;
    invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 1002
    invoke-virtual {v1, v2}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 1004
    new-instance v3, Lcom/facebook/internal/LikeActionController$10;

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/facebook/internal/LikeActionController$10;-><init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V

    invoke-virtual {v2, v3}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V

    .line 1027
    invoke-virtual {v2}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;

    goto :goto_0
.end method

.method private static getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0, "objectId"    # Ljava/lang/String;

    .prologue
    .line 473
    const/4 v0, 0x0

    .line 474
    .local v0, "accessTokenPortion":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v1

    .line 475
    .local v1, "activeSession":Lcom/facebook/Session;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/Session;->isOpened()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 476
    invoke-virtual {v1}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 478
    :cond_0
    if-eqz v0, :cond_1

    .line 482
    invoke-static {v0}, Lcom/facebook/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 484
    :cond_1
    const-string v2, "%s|%s|com.fb.sdk.like|%d"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    const/4 v4, 0x1

    const-string v5, ""

    .line 487
    invoke-static {v0, v5}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    sget v5, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    .line 488
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    .line 484
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public static getControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "objectId"    # Ljava/lang/String;
    .param p2, "callback"    # Lcom/facebook/internal/LikeActionController$CreationCallback;

    .prologue
    .line 176
    sget-boolean v1, Lcom/facebook/internal/LikeActionController;->isInitialized:Z

    if-nez v1, :cond_0

    .line 177
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->performFirstInitialize(Landroid/content/Context;)V

    .line 180
    :cond_0
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;

    move-result-object v0

    .line 181
    .local v0, "controllerForObject":Lcom/facebook/internal/LikeActionController;
    if-eqz v0, :cond_1

    .line 183
    invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    .line 187
    :goto_0
    return-void

    .line 185
    :cond_1
    sget-object v1, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v2, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;

    invoke-direct {v2, p0, p1, p2}, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    invoke-virtual {v1, v2}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    goto :goto_0
.end method

.method private static getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    .locals 5
    .param p0, "objectId"    # Ljava/lang/String;

    .prologue
    .line 331
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 333
    .local v0, "cacheKey":Ljava/lang/String;
    sget-object v2, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/internal/LikeActionController;

    .line 334
    .local v1, "controller":Lcom/facebook/internal/LikeActionController;
    if-eqz v1, :cond_0

    .line 336
    sget-object v2, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v3, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v2, v3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 339
    :cond_0
    return-object v1
.end method

.method private getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;
    .locals 1
    .param p1, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    .line 683
    new-instance v0, Lcom/facebook/internal/LikeActionController$5;

    invoke-direct {v0, p0, p1}, Lcom/facebook/internal/LikeActionController$5;-><init>(Lcom/facebook/internal/LikeActionController;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static handleOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;)Z
    .locals 5
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x0

    .line 132
    invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getCallIdFromIntent(Landroid/content/Intent;)Ljava/util/UUID;

    move-result-object v0

    .line 133
    .local v0, "callId":Ljava/util/UUID;
    if-nez v0, :cond_1

    .line 163
    :cond_0
    :goto_0
    return v2

    .line 138
    :cond_1
    sget-object v3, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 139
    const-string v3, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 143
    .local v1, "sharedPreferences":Landroid/content/SharedPreferences;
    const-string v3, "PENDING_CONTROLLER_KEY"

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    .line 148
    .end local v1    # "sharedPreferences":Landroid/content/SharedPreferences;
    :cond_2
    sget-object v3, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 153
    sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    new-instance v3, Lcom/facebook/internal/LikeActionController$1;

    invoke-direct {v3, p1, p2, p3, v0}, Lcom/facebook/internal/LikeActionController$1;-><init>(IILandroid/content/Intent;Ljava/util/UUID;)V

    invoke-static {p0, v2, v3}, Lcom/facebook/internal/LikeActionController;->getControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    .line 163
    const/4 v2, 0x1

    goto :goto_0
.end method

.method private static invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V
    .locals 2
    .param p0, "callback"    # Lcom/facebook/internal/LikeActionController$CreationCallback;
    .param p1, "controller"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 251
    if-nez p0, :cond_0

    .line 261
    :goto_0
    return-void

    .line 255
    :cond_0
    sget-object v0, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/internal/LikeActionController$3;

    invoke-direct {v1, p0, p1}, Lcom/facebook/internal/LikeActionController$3;-><init>(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "parameters"    # Landroid/os/Bundle;

    .prologue
    .line 1031
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1032
    .local v0, "logParams":Landroid/os/Bundle;
    const-string v1, "object_id"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1033
    const-string v1, "current_action"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1035
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v2, "fb_like_control_error"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 1036
    return-void
.end method

.method private logAppEventForError(Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    .locals 4
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "error"    # Lcom/facebook/FacebookRequestError;

    .prologue
    .line 1039
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1040
    .local v0, "logParams":Landroid/os/Bundle;
    if-eqz p2, :cond_0

    .line 1041
    invoke-virtual {p2}, Lcom/facebook/FacebookRequestError;->getRequestResult()Lorg/json/JSONObject;

    move-result-object v1

    .line 1042
    .local v1, "requestResult":Lorg/json/JSONObject;
    if-eqz v1, :cond_0

    .line 1043
    const-string v2, "error"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    .end local v1    # "requestResult":Lorg/json/JSONObject;
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1047
    return-void
.end method

.method private onActivityResult(IILandroid/content/Intent;Ljava/util/UUID;)Z
    .locals 4
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;
    .param p4, "callId"    # Ljava/util/UUID;

    .prologue
    const/4 v1, 0x0

    .line 657
    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v2, p4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 679
    :cond_0
    :goto_0
    return v1

    .line 662
    :cond_1
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v0

    .line 663
    .local v0, "pendingCall":Lcom/facebook/widget/FacebookDialog$PendingCall;
    if-eqz v0, :cond_0

    .line 668
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    .line 673
    invoke-direct {p0, v2}, Lcom/facebook/internal/LikeActionController;->getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;

    move-result-object v2

    .line 668
    invoke-static {v1, v0, p1, p3, v2}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    .line 677
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->stopTrackingPendingCall()V

    .line 679
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private static declared-synchronized performFirstInitialize(Landroid/content/Context;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 232
    const-class v2, Lcom/facebook/internal/LikeActionController;

    monitor-enter v2

    :try_start_0
    sget-boolean v1, Lcom/facebook/internal/LikeActionController;->isInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 248
    :goto_0
    monitor-exit v2

    return-void

    .line 236
    :cond_0
    :try_start_1
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    .line 238
    const-string v1, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 242
    .local v0, "sharedPreferences":Landroid/content/SharedPreferences;
    const-string v1, "OBJECT_SUFFIX"

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    .line 243
    new-instance v1, Lcom/facebook/internal/FileLruCache;

    sget-object v3, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    new-instance v4, Lcom/facebook/internal/FileLruCache$Limits;

    invoke-direct {v4}, Lcom/facebook/internal/FileLruCache$Limits;-><init>()V

    invoke-direct {v1, p0, v3, v4}, Lcom/facebook/internal/FileLruCache;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/FileLruCache$Limits;)V

    sput-object v1, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    .line 245
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->registerSessionBroadcastReceivers(Landroid/content/Context;)V

    .line 247
    const/4 v1, 0x1

    sput-boolean v1, Lcom/facebook/internal/LikeActionController;->isInitialized:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 232
    .end local v0    # "sharedPreferences":Landroid/content/SharedPreferences;
    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1
.end method

.method private performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "shouldLikeObject"    # Z
    .param p3, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    .line 586
    invoke-direct {p0, p2}, Lcom/facebook/internal/LikeActionController;->canUseOGPublish(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 587
    if-eqz p2, :cond_0

    .line 588
    invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->publishLikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 595
    :goto_0
    return-void

    .line 590
    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->publishUnlikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 593
    :cond_1
    invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 7
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    const/4 v6, 0x0

    .line 634
    new-instance v0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v0, p1, v3}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 636
    .local v0, "likeDialogBuilder":Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->canPresent()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 637
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->build()Lcom/facebook/widget/FacebookDialog;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/widget/FacebookDialog;->present()Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v3

    invoke-direct {p0, v3, p2}, Lcom/facebook/internal/LikeActionController;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V

    .line 638
    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v4, "fb_like_control_did_present_dialog"

    invoke-virtual {v3, v4, v6, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 654
    :cond_0
    :goto_0
    return-void

    .line 640
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getWebFallbackUrl()Ljava/lang/String;

    move-result-object v2

    .line 641
    .local v2, "webFallbackUrl":Ljava/lang/String;
    invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 645
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getApplicationId()Ljava/lang/String;

    move-result-object v3

    .line 646
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getAppCall()Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v4

    .line 647
    invoke-direct {p0, p2}, Lcom/facebook/internal/LikeActionController;->getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;

    move-result-object v5

    .line 642
    invoke-static {p1, v2, v3, v4, v5}, Lcom/facebook/internal/FacebookWebFallbackDialog;->presentWebFallback(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    move-result v1

    .line 648
    .local v1, "webFallbackShown":Z
    if-eqz v1, :cond_0

    .line 649
    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v4, "fb_like_control_did_present_fallback_dialog"

    invoke-virtual {v3, v4, v6, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private publishLikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    .line 783
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    .line 785
    new-instance v0, Lcom/facebook/internal/LikeActionController$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/internal/LikeActionController$6;-><init>(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V

    .line 834
    return-void
.end method

.method private publishUnlikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    .line 837
    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    .line 840
    new-instance v0, Lcom/facebook/RequestBatch;

    invoke-direct {v0}, Lcom/facebook/RequestBatch;-><init>()V

    .line 841
    .local v0, "requestBatch":Lcom/facebook/RequestBatch;
    new-instance v1, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 842
    .local v1, "unlikeRequest":Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;
    invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 843
    new-instance v2, Lcom/facebook/internal/LikeActionController$7;

    invoke-direct {v2, p0, v1, p1, p2}, Lcom/facebook/internal/LikeActionController$7;-><init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V

    .line 873
    invoke-virtual {v0}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 874
    return-void
.end method

.method private static putControllerInMemoryCache(Ljava/lang/String;Lcom/facebook/internal/LikeActionController;)V
    .locals 4
    .param p0, "objectId"    # Ljava/lang/String;
    .param p1, "controllerForObject"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 323
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 325
    .local v0, "cacheKey":Ljava/lang/String;
    sget-object v1, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v2, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 327
    sget-object v1, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    return-void
.end method

.method private refreshStatusAsync()V
    .locals 2

    .prologue
    .line 877
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/SessionState;->CREATED:Lcom/facebook/SessionState;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v1}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 881
    :cond_0
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->refreshStatusViaService()V

    .line 923
    :goto_0
    return-void

    .line 885
    :cond_1
    new-instance v0, Lcom/facebook/internal/LikeActionController$8;

    invoke-direct {v0, p0}, Lcom/facebook/internal/LikeActionController$8;-><init>(Lcom/facebook/internal/LikeActionController;)V

    invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V

    goto :goto_0
.end method

.method private refreshStatusViaService()V
    .locals 5

    .prologue
    .line 926
    new-instance v1, Lcom/facebook/internal/LikeStatusClient;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    .line 928
    invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/internal/LikeStatusClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 930
    .local v1, "likeStatusClient":Lcom/facebook/internal/LikeStatusClient;
    invoke-virtual {v1}, Lcom/facebook/internal/LikeStatusClient;->start()Z

    move-result v2

    if-nez v2, :cond_0

    .line 980
    :goto_0
    return-void

    .line 934
    :cond_0
    new-instance v0, Lcom/facebook/internal/LikeActionController$9;

    invoke-direct {v0, p0}, Lcom/facebook/internal/LikeActionController$9;-><init>(Lcom/facebook/internal/LikeActionController;)V

    .line 979
    .local v0, "callback":Lcom/facebook/internal/PlatformServiceClient$CompletedListener;
    invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeStatusClient;->setCompletedListener(Lcom/facebook/internal/PlatformServiceClient$CompletedListener;)V

    goto :goto_0
.end method

.method private static registerSessionBroadcastReceivers(Landroid/content/Context;)V
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 268
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    .line 270
    .local v0, "broadcastManager":Landroid/support/v4/content/LocalBroadcastManager;
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 271
    .local v1, "filter":Landroid/content/IntentFilter;
    const-string v2, "com.facebook.sdk.ACTIVE_SESSION_UNSET"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 272
    const-string v2, "com.facebook.sdk.ACTIVE_SESSION_CLOSED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 273
    const-string v2, "com.facebook.sdk.ACTIVE_SESSION_OPENED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 275
    new-instance v2, Lcom/facebook/internal/LikeActionController$4;

    invoke-direct {v2}, Lcom/facebook/internal/LikeActionController$4;-><init>()V

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 320
    return-void
.end method

.method private static serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V
    .locals 4
    .param p0, "controller"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 347
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToJson(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v1

    .line 348
    .local v1, "controllerJson":Ljava/lang/String;
    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-static {v2}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 350
    .local v0, "cacheKey":Ljava/lang/String;
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 351
    sget-object v2, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v3, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;

    invoke-direct {v3, v0, v1}, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 353
    :cond_0
    return-void
.end method

.method private static serializeToDiskSynchronously(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p0, "cacheKey"    # Ljava/lang/String;
    .param p1, "controllerJson"    # Ljava/lang/String;

    .prologue
    .line 360
    const/4 v1, 0x0

    .line 362
    .local v1, "outputStream":Ljava/io/OutputStream;
    :try_start_0
    sget-object v2, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    invoke-virtual {v2, p0}, Lcom/facebook/internal/FileLruCache;->openPutStream(Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v1

    .line 363
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    if-eqz v1, :cond_0

    .line 368
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 371
    :cond_0
    :goto_0
    return-void

    .line 364
    :catch_0
    move-exception v0

    .line 365
    .local v0, "e":Ljava/io/IOException;
    :try_start_1
    sget-object v2, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v3, "Unable to serialize controller to disk"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 367
    if-eqz v1, :cond_0

    .line 368
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 367
    .end local v0    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    .line 368
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    :cond_1
    throw v2
.end method

.method private static serializeToJson(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 5
    .param p0, "controller"    # Lcom/facebook/internal/LikeActionController;

    .prologue
    .line 445
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 447
    .local v1, "controllerJson":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "com.facebook.internal.LikeActionController.version"

    const/4 v4, 0x2

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 448
    const-string v3, "object_id"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 449
    const-string v3, "like_count_string_with_like"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 450
    const-string v3, "like_count_string_without_like"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 451
    const-string v3, "social_sentence_with_like"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 452
    const-string v3, "social_sentence_without_like"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 453
    const-string v3, "is_object_liked"

    iget-boolean v4, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 454
    const-string v3, "unlike_token"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 455
    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    if-eqz v3, :cond_0

    .line 456
    const-string v3, "pending_call_id"

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 458
    :cond_0
    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    .line 459
    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    invoke-static {v3}, Lcom/facebook/internal/BundleJSONConverter;->convertToJSON(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object v0

    .line 460
    .local v0, "analyticsJSON":Lorg/json/JSONObject;
    if-eqz v0, :cond_1

    .line 461
    const-string v3, "pending_call_analytics_bundle"

    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 469
    .end local v0    # "analyticsJSON":Lorg/json/JSONObject;
    :cond_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    return-object v3

    .line 464
    :catch_0
    move-exception v2

    .line 465
    .local v2, "e":Lorg/json/JSONException;
    sget-object v3, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v4, "Unable to serialize controller to JSON"

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 466
    const/4 v3, 0x0

    goto :goto_0
.end method

.method private stopTrackingPendingCall()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 755
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->stopTrackingPendingCall(Ljava/util/UUID;)V

    .line 757
    iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    .line 758
    iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    .line 760
    invoke-direct {p0, v2}, Lcom/facebook/internal/LikeActionController;->storeObjectIdForPendingController(Ljava/lang/String;)V

    .line 761
    return-void
.end method

.method private storeObjectIdForPendingController(Ljava/lang/String;)V
    .locals 3
    .param p1, "objectId"    # Ljava/lang/String;

    .prologue
    .line 764
    sput-object p1, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    .line 765
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    const-string v1, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 766
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PENDING_CONTROLLER_KEY"

    sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    .line 767
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 768
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 769
    return-void
.end method

.method private toggleAgainIfNeeded(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    .line 983
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    iget-boolean v1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLikedOnServer:Z

    if-eq v0, v1, :cond_0

    .line 984
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/internal/LikeActionController;->performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V

    .line 986
    :cond_0
    return-void
.end method

.method private trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V
    .locals 1
    .param p1, "pendingCall"    # Lcom/facebook/widget/FacebookDialog$PendingCall;
    .param p2, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    .line 741
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V

    .line 744
    invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    .line 745
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->storeObjectIdForPendingController(Ljava/lang/String;)V

    .line 748
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    .line 751
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V

    .line 752
    return-void
.end method

.method private updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "isObjectLiked"    # Z
    .param p2, "likeCountStringWithLike"    # Ljava/lang/String;
    .param p3, "likeCountStringWithoutLike"    # Ljava/lang/String;
    .param p4, "socialSentenceWithLike"    # Ljava/lang/String;
    .param p5, "socialSentenceWithoutLike"    # Ljava/lang/String;
    .param p6, "unlikeToken"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 604
    invoke-static {p2, v1}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 605
    invoke-static {p3, v1}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 606
    invoke-static {p4, v1}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    .line 607
    invoke-static {p5, v1}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    .line 608
    invoke-static {p6, v1}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    .line 610
    iget-boolean v1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    .line 611
    invoke-static {p2, v1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    .line 612
    invoke-static {p3, v1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    .line 613
    invoke-static {p4, v1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    .line 614
    invoke-static {p5, v1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    .line 615
    invoke-static {p6, v1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 617
    .local v0, "stateChanged":Z
    :goto_0
    if-nez v0, :cond_2

    .line 631
    :goto_1
    return-void

    .line 615
    .end local v0    # "stateChanged":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 621
    .restart local v0    # "stateChanged":Z
    :cond_2
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    .line 622
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    .line 623
    iput-object p3, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    .line 624
    iput-object p4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    .line 625
    iput-object p5, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    .line 626
    iput-object p6, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    .line 628
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V

    .line 630
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    const-string v2, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-static {v1, p0, v2}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public getLikeCountString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 539
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    goto :goto_0
.end method

.method public getObjectId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 531
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public getSocialSentence()Ljava/lang/String;
    .locals 1

    .prologue
    .line 547
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    goto :goto_0
.end method

.method public isObjectLiked()Z
    .locals 1

    .prologue
    .line 555
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    return v0
.end method

.method public toggleLike(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "analyticsParameters"    # Landroid/os/Bundle;

    .prologue
    const/4 v7, 0x0

    .line 562
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v2, "fb_like_control_did_tap"

    invoke-virtual {v0, v2, v7, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 564
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-nez v0, :cond_0

    const/4 v1, 0x1

    .line 565
    .local v1, "shouldLikeObject":Z
    :goto_0
    invoke-direct {p0, v1}, Lcom/facebook/internal/LikeActionController;->canUseOGPublish(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 567
    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    if-eqz v0, :cond_1

    .line 577
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v2, "fb_like_control_did_undo_quickly"

    invoke-virtual {v0, v2, v7, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 583
    :goto_1
    return-void

    .line 564
    .end local v1    # "shouldLikeObject":Z
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 582
    .restart local v1    # "shouldLikeObject":Z
    :cond_1
    invoke-direct {p0, p1, v1, p2}, Lcom/facebook/internal/LikeActionController;->performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V

    goto :goto_1
.end method
