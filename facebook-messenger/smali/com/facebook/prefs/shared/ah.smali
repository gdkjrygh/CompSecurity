.class public Lcom/facebook/prefs/shared/ah;
.super Ljava/lang/Object;
.source "PrefsMigrator.java"


# static fields
.field static final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final b:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final c:Lcom/facebook/prefs/shared/ae;

.field static final d:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final e:Lcom/facebook/prefs/shared/ae;

.field static final f:Lcom/facebook/prefs/shared/ae;

.field private static final g:Ljava/lang/String;


# instance fields
.field private final h:Lcom/fasterxml/jackson/databind/ObjectMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 30
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    sput-object v0, Lcom/facebook/prefs/shared/ah;->g:Ljava/lang/String;

    .line 34
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/app_info"

    sget-object v2, Lcom/facebook/prefs/shared/ah;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "//gk"

    sget-object v2, Lcom/facebook/prefs/shared/ah;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/ah;->a:Lcom/google/common/a/ev;

    .line 42
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/auth/"

    const-string v2, "/auth/user_data/"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/auth_machine_id"

    const-string v2, "/auth/auth_machine_id"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/me_user_version"

    const-string v2, "/auth/me_user_version"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/app_info"

    const-string v2, "/config/app_info"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/gk/"

    const-string v2, "/config/gk/"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/gk_version"

    const-string v2, "/config/gk/version"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/rollout/"

    const-string v2, "/config/rollout"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/rollout_version"

    const-string v2, "/config/rollout/version"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/device_id/"

    const-string v2, "/shared/device_id"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/c2dm/"

    const-string v2, "/messenger/c2dm/"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/first_install_time"

    const-string v2, "/messenger/first_install_time"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/nux_completed"

    const-string v2, "/messenger/nux_completed"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/login_reminder_trigger_state"

    const-string v2, "/messenger/login_reminder_trigger_state"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/phone_confirm"

    const-string v2, "/messenger/phone_confirm"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/sms"

    const-string v2, "/messages/sms"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/ui_counters"

    const-string v2, "/messages/ui_counters"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/notifications/recent_threads"

    const-string v2, "/messages/notifications/recent_threads"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/preferences/notifications/location_services"

    const-string v2, "/settings/messages/location_services"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/preferences/notifications"

    const-string v2, "/settings/messages/notifications"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/preferences/threads"

    const-string v2, "/settings/messages/threads"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/debug_logs"

    const-string v2, "/settings/logging/debug_logs"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/logging_level"

    const-string v2, "/settings/logging/logging_level"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/php_profiling"

    const-string v2, "/settings/http/php_profiling"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/wirehog_profiling"

    const-string v2, "/settings/http/wirehog_profiling"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/force_fb4a_look_and_feel"

    const-string v2, "/settings/messenger/force_fb4a_look_and_feel"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/web"

    const-string v2, "/settings/sandbox/web"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/internal/mqtt"

    const-string v2, "/settings/sandbox/mqtt"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/device_id"

    const-string v2, "/shared/device_id"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/mqtt"

    const-string v2, "/mqtt"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "/orca/top_last_active_sync_time"

    sget-object v2, Lcom/facebook/prefs/shared/ah;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/ah;->b:Lcom/google/common/a/ev;

    .line 108
    new-instance v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/fb_android/bookmarks/newsfeed_filter_type_key"

    invoke-direct {v0, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/prefs/shared/ah;->c:Lcom/facebook/prefs/shared/ae;

    .line 114
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "most_recent"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "top_stories"

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/ah;->d:Lcom/google/common/a/ev;

    .line 122
    new-instance v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/orca/pref_version"

    invoke-direct {v0, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/prefs/shared/ah;->e:Lcom/facebook/prefs/shared/ae;

    .line 123
    new-instance v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/_meta_/prefs_version"

    invoke-direct {v0, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/prefs/shared/ah;->f:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Lcom/facebook/prefs/shared/ah;->h:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 130
    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;Lcom/facebook/prefs/shared/ae;Ljava/util/SortedMap;Ljava/util/SortedMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/ae;",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 231
    invoke-static {p3, p1}, Lcom/facebook/prefs/shared/af;->a(Ljava/util/SortedMap;Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;

    move-result-object v2

    .line 232
    invoke-interface {v2}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 233
    if-eqz p2, :cond_0

    .line 234
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 235
    invoke-virtual {v1, p1}, Lcom/facebook/prefs/shared/ae;->b(Lcom/facebook/common/s/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 236
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p4, v1, v0}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 239
    :cond_1
    invoke-interface {v2}, Ljava/util/SortedMap;->clear()V

    .line 240
    return-void
.end method

.method private b(Ljava/util/Map;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 200
    sget-object v0, Lcom/facebook/prefs/shared/ah;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    sget-object v0, Lcom/facebook/prefs/shared/ah;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 207
    :goto_0
    return v0

    .line 202
    :cond_0
    sget-object v0, Lcom/facebook/prefs/shared/ah;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 203
    const/4 v0, 0x1

    goto :goto_0

    .line 205
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/util/SortedMap;)Ljava/util/SortedMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 251
    new-instance v0, Lcom/facebook/prefs/shared/ae;

    const-string v1, "/auth/user_data/fb_me_user"

    invoke-direct {v0, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    .line 252
    new-instance v1, Lcom/facebook/prefs/shared/ae;

    const-string v2, "/auth/user_data/fb_uid"

    invoke-direct {v1, v2}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    .line 253
    invoke-interface {p1, v0}, Ljava/util/SortedMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 254
    if-nez v0, :cond_0

    .line 264
    :goto_0
    return-object p1

    .line 258
    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/facebook/prefs/shared/ah;->h:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    .line 259
    const-string v2, "uid"

    invoke-virtual {v0, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/facebook/common/w/e;->a(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 260
    invoke-interface {p1, v1, v0}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 261
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private c(Ljava/util/SortedMap;)Ljava/util/SortedMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 269
    sget-object v0, Lcom/facebook/prefs/shared/ah;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v0}, Ljava/util/SortedMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 270
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 271
    sget-object v1, Lcom/facebook/prefs/shared/ah;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v1, v0}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    :cond_0
    :goto_0
    return-object p1

    .line 274
    :cond_1
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 278
    check-cast v0, Ljava/lang/Integer;

    .line 279
    sget-object v1, Lcom/facebook/prefs/shared/ah;->d:Lcom/google/common/a/ev;

    invoke-virtual {v1, v0}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 282
    if-eqz v0, :cond_0

    .line 283
    sget-object v1, Lcom/facebook/prefs/shared/ah;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {p1, v1, v0}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/SortedMap;)Ljava/util/SortedMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x4

    .line 159
    invoke-virtual {p0, p1, v2}, Lcom/facebook/prefs/shared/ah;->a(Ljava/util/SortedMap;I)Ljava/util/SortedMap;

    move-result-object v0

    .line 160
    invoke-direct {p0, v0}, Lcom/facebook/prefs/shared/ah;->b(Ljava/util/Map;)I

    move-result v1

    .line 161
    invoke-static {v2, v1}, Lcom/facebook/debug/b/a;->a(II)V

    .line 162
    return-object v0
.end method

.method a(Ljava/util/SortedMap;I)Ljava/util/SortedMap;
    .locals 5
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;I)",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    .line 168
    invoke-static {p1}, Lcom/google/common/a/ik;->a(Ljava/util/SortedMap;)Ljava/util/TreeMap;

    move-result-object v0

    .line 169
    invoke-direct {p0, v0}, Lcom/facebook/prefs/shared/ah;->b(Ljava/util/Map;)I

    move-result v1

    .line 172
    if-nez v1, :cond_0

    .line 173
    sget-object v1, Lcom/facebook/prefs/shared/ah;->a:Lcom/google/common/a/ev;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/prefs/shared/ah;->a(Ljava/util/SortedMap;Ljava/util/Map;)Ljava/util/SortedMap;

    move-result-object v0

    move v1, v4

    .line 176
    :cond_0
    if-ne v1, v4, :cond_1

    if-ge v1, p2, :cond_1

    .line 178
    sget-object v1, Lcom/facebook/prefs/shared/ah;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Ljava/util/SortedMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    sget-object v1, Lcom/facebook/prefs/shared/ah;->b:Lcom/google/common/a/ev;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/prefs/shared/ah;->a(Ljava/util/SortedMap;Ljava/util/Map;)Ljava/util/SortedMap;

    move-result-object v0

    .line 181
    sget-object v1, Lcom/facebook/prefs/shared/ah;->f:Lcom/facebook/prefs/shared/ae;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v3

    .line 183
    :cond_1
    if-ne v1, v3, :cond_2

    if-ge v1, p2, :cond_2

    .line 185
    invoke-direct {p0, v0}, Lcom/facebook/prefs/shared/ah;->b(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    move-result-object v0

    .line 187
    sget-object v1, Lcom/facebook/prefs/shared/ah;->f:Lcom/facebook/prefs/shared/ae;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v2

    .line 189
    :cond_2
    if-ne v1, v2, :cond_3

    if-ge v1, p2, :cond_3

    .line 190
    invoke-direct {p0, v0}, Lcom/facebook/prefs/shared/ah;->c(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 191
    const/4 v1, 0x4

    .line 192
    sget-object v2, Lcom/facebook/prefs/shared/ah;->f:Lcom/facebook/prefs/shared/ae;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/SortedMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    :cond_3
    return-object v0
.end method

.method a(Ljava/util/SortedMap;Ljava/util/Map;)Ljava/util/SortedMap;
    .locals 7
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 214
    invoke-static {}, Lcom/google/common/a/ik;->d()Ljava/util/TreeMap;

    move-result-object v2

    .line 215
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 216
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v4, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    .line 217
    const/4 v1, 0x0

    .line 218
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lcom/facebook/prefs/shared/ah;->g:Ljava/lang/String;

    if-eq v5, v6, :cond_1

    .line 219
    new-instance v1, Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    .line 221
    :goto_1
    invoke-direct {p0, v4, v0, p1, v2}, Lcom/facebook/prefs/shared/ah;->a(Lcom/facebook/prefs/shared/ae;Lcom/facebook/prefs/shared/ae;Ljava/util/SortedMap;Ljava/util/SortedMap;)V

    goto :goto_0

    .line 223
    :cond_0
    return-object v2

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public a(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 148
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/ah;->b(Ljava/util/Map;)I

    move-result v0

    .line 149
    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
