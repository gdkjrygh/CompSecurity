.class public Lroboguice/config/DefaultRoboModule;
.super Lcom/google/inject/AbstractModule;
.source "DefaultRoboModule.java"


# static fields
.field protected static final accountManagerClass:Ljava/lang/Class;

.field protected static final fragmentManagerClass:Ljava/lang/Class;


# instance fields
.field protected application:Landroid/app/Application;

.field protected contextScope:Lroboguice/inject/ContextScope;

.field protected resourceListener:Lroboguice/inject/ResourceListener;

.field protected viewListener:Lroboguice/inject/ViewListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 64
    const/4 v0, 0x0

    .line 66
    .local v0, "c":Ljava/lang/Class;
    :try_start_0
    const-string v1, "android.support.v4.app.FragmentManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 68
    :goto_0
    sput-object v0, Lroboguice/config/DefaultRoboModule;->fragmentManagerClass:Ljava/lang/Class;

    .line 72
    const/4 v0, 0x0

    .line 74
    :try_start_1
    const-string v1, "android.accounts.AccountManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 76
    :goto_1
    sput-object v0, Lroboguice/config/DefaultRoboModule;->accountManagerClass:Ljava/lang/Class;

    .line 77
    return-void

    .line 75
    :catch_0
    move-exception v1

    goto :goto_1

    .line 67
    :catch_1
    move-exception v1

    goto :goto_0
.end method

.method public constructor <init>(Landroid/app/Application;Lroboguice/inject/ContextScope;Lroboguice/inject/ViewListener;Lroboguice/inject/ResourceListener;)V
    .locals 0
    .param p1, "application"    # Landroid/app/Application;
    .param p2, "contextScope"    # Lroboguice/inject/ContextScope;
    .param p3, "viewListener"    # Lroboguice/inject/ViewListener;
    .param p4, "resourceListener"    # Lroboguice/inject/ResourceListener;

    .prologue
    .line 86
    invoke-direct {p0}, Lcom/google/inject/AbstractModule;-><init>()V

    .line 89
    iput-object p1, p0, Lroboguice/config/DefaultRoboModule;->application:Landroid/app/Application;

    .line 90
    iput-object p2, p0, Lroboguice/config/DefaultRoboModule;->contextScope:Lroboguice/inject/ContextScope;

    .line 91
    iput-object p3, p0, Lroboguice/config/DefaultRoboModule;->viewListener:Lroboguice/inject/ViewListener;

    .line 92
    iput-object p4, p0, Lroboguice/config/DefaultRoboModule;->resourceListener:Lroboguice/inject/ResourceListener;

    .line 93
    return-void
.end method


# virtual methods
.method protected configure()V
    .locals 11

    .prologue
    const/4 v10, 0x0

    .line 101
    const-class v7, Landroid/content/Context;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;

    move-result-object v1

    .line 102
    .local v1, "contextProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Landroid/content/Context;>;"
    new-instance v3, Lroboguice/inject/ExtrasListener;

    invoke-direct {v3, v1}, Lroboguice/inject/ExtrasListener;-><init>(Lcom/google/inject/Provider;)V

    .line 103
    .local v3, "extrasListener":Lroboguice/inject/ExtrasListener;
    new-instance v6, Lroboguice/inject/PreferenceListener;

    iget-object v7, p0, Lroboguice/config/DefaultRoboModule;->application:Landroid/app/Application;

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->contextScope:Lroboguice/inject/ContextScope;

    invoke-direct {v6, v1, v7, v8}, Lroboguice/inject/PreferenceListener;-><init>(Lcom/google/inject/Provider;Landroid/app/Application;Lroboguice/inject/ContextScope;)V

    .line 104
    .local v6, "preferenceListener":Lroboguice/inject/PreferenceListener;
    new-instance v5, Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;

    invoke-direct {v5}, Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;-><init>()V

    .line 105
    .local v5, "observerThreadingDecorator":Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;
    iget-object v7, p0, Lroboguice/config/DefaultRoboModule;->application:Landroid/app/Application;

    invoke-virtual {v7}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    const-string v8, "android_id"

    invoke-static {v7, v8}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 109
    .local v0, "androidId":Ljava/lang/String;
    :try_start_0
    iget-object v7, p0, Lroboguice/config/DefaultRoboModule;->application:Landroid/app/Application;

    invoke-virtual {v7}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->application:Landroid/app/Application;

    invoke-virtual {v8}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 110
    .local v4, "info":Landroid/content/pm/PackageInfo;
    const-class v7, Landroid/content/pm/PackageInfo;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    invoke-interface {v7, v4}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    invoke-static {v0}, Lroboguice/util/Strings;->notEmpty(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 117
    invoke-virtual {p0}, Lroboguice/config/DefaultRoboModule;->bindConstant()Lcom/google/inject/binder/AnnotatedConstantBindingBuilder;

    move-result-object v7

    const-string v8, "android_id"

    invoke-static {v8}, Lcom/google/inject/name/Names;->named(Ljava/lang/String;)Lcom/google/inject/name/Named;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedConstantBindingBuilder;->annotatedWith(Ljava/lang/annotation/Annotation;)Lcom/google/inject/binder/ConstantBindingBuilder;

    move-result-object v7

    invoke-interface {v7, v0}, Lcom/google/inject/binder/ConstantBindingBuilder;->to(Ljava/lang/String;)V

    .line 121
    :cond_0
    const-class v7, Lroboguice/inject/ViewListener;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->viewListener:Lroboguice/inject/ViewListener;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 122
    const-class v7, Lroboguice/inject/PreferenceListener;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    invoke-interface {v7, v6}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 127
    const-class v7, Lroboguice/inject/ContextSingleton;

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->contextScope:Lroboguice/inject/ContextScope;

    invoke-virtual {p0, v7, v8}, Lroboguice/config/DefaultRoboModule;->bindScope(Ljava/lang/Class;Lcom/google/inject/Scope;)V

    .line 128
    const-class v7, Lroboguice/inject/ContextScope;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->contextScope:Lroboguice/inject/ContextScope;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 129
    const-class v7, Landroid/content/res/AssetManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/AssetManagerProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 130
    const-class v7, Landroid/content/Context;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/config/DefaultRoboModule$1;

    invoke-direct {v8, p0}, Lroboguice/config/DefaultRoboModule$1;-><init>(Lroboguice/config/DefaultRoboModule;)V

    invoke-static {v8}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ContextSingleton;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 131
    const-class v7, Landroid/app/Activity;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/config/DefaultRoboModule$2;

    invoke-direct {v8, p0}, Lroboguice/config/DefaultRoboModule$2;-><init>(Lroboguice/config/DefaultRoboModule;)V

    invoke-static {v8}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ContextSingleton;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 132
    const-class v7, Lroboguice/activity/RoboActivity;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/config/DefaultRoboModule$3;

    invoke-direct {v8, p0}, Lroboguice/config/DefaultRoboModule$3;-><init>(Lroboguice/config/DefaultRoboModule;)V

    invoke-static {v8}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ContextSingleton;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 133
    const-class v7, Landroid/app/Service;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/config/DefaultRoboModule$4;

    invoke-direct {v8, p0}, Lroboguice/config/DefaultRoboModule$4;-><init>(Lroboguice/config/DefaultRoboModule;)V

    invoke-static {v8}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ContextSingleton;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 134
    const-class v7, Lroboguice/service/RoboService;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/config/DefaultRoboModule$5;

    invoke-direct {v8, p0}, Lroboguice/config/DefaultRoboModule$5;-><init>(Lroboguice/config/DefaultRoboModule;)V

    invoke-static {v8}, Lcom/google/inject/Key;->get(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/Key;

    move-result-object v8

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ContextSingleton;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/ScopedBindingBuilder;->in(Ljava/lang/Class;)V

    .line 138
    const-class v7, Landroid/content/SharedPreferences;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/SharedPreferencesProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 139
    const-class v7, Landroid/content/res/Resources;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ResourcesProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 140
    const-class v7, Landroid/content/ContentResolver;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/ContentResolverProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 141
    const-class v7, Landroid/app/Application;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->application:Landroid/app/Application;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 142
    const-class v7, Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    invoke-interface {v7, v5}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toInstance(Ljava/lang/Object;)V

    .line 143
    const-class v7, Landroid/os/Handler;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/HandlerProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 148
    const-class v7, Landroid/location/LocationManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "location"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 149
    const-class v7, Landroid/view/WindowManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "window"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 150
    const-class v7, Landroid/app/ActivityManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "activity"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 151
    const-class v7, Landroid/os/PowerManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "power"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 152
    const-class v7, Landroid/app/AlarmManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "alarm"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 153
    const-class v7, Landroid/app/NotificationManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "notification"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 154
    const-class v7, Landroid/app/KeyguardManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "keyguard"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 155
    const-class v7, Landroid/os/Vibrator;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "vibrator"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 156
    const-class v7, Landroid/net/ConnectivityManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "connectivity"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 157
    const-class v7, Landroid/net/wifi/WifiManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "wifi"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 158
    const-class v7, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "input_method"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 159
    const-class v7, Landroid/hardware/SensorManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "sensor"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 160
    const-class v7, Landroid/telephony/TelephonyManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "phone"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 161
    const-class v7, Landroid/media/AudioManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/SystemServiceProvider;

    const-string v9, "audio"

    invoke-direct {v8, v9}, Lroboguice/inject/SystemServiceProvider;-><init>(Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 164
    const-class v7, Landroid/view/LayoutInflater;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/ContextScopedSystemServiceProvider;

    const-string v9, "layout_inflater"

    invoke-direct {v8, v1, v9}, Lroboguice/inject/ContextScopedSystemServiceProvider;-><init>(Lcom/google/inject/Provider;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 165
    const-class v7, Landroid/app/SearchManager;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    new-instance v8, Lroboguice/inject/ContextScopedSystemServiceProvider;

    const-string v9, "search"

    invoke-direct {v8, v1, v9}, Lroboguice/inject/ContextScopedSystemServiceProvider;-><init>(Lcom/google/inject/Provider;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 169
    invoke-static {}, Lcom/google/inject/matcher/Matchers;->any()Lcom/google/inject/matcher/Matcher;

    move-result-object v7

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->resourceListener:Lroboguice/inject/ResourceListener;

    invoke-virtual {p0, v7, v8}, Lroboguice/config/DefaultRoboModule;->bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V

    .line 170
    invoke-static {}, Lcom/google/inject/matcher/Matchers;->any()Lcom/google/inject/matcher/Matcher;

    move-result-object v7

    invoke-virtual {p0, v7, v3}, Lroboguice/config/DefaultRoboModule;->bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V

    .line 171
    invoke-static {}, Lcom/google/inject/matcher/Matchers;->any()Lcom/google/inject/matcher/Matcher;

    move-result-object v7

    iget-object v8, p0, Lroboguice/config/DefaultRoboModule;->viewListener:Lroboguice/inject/ViewListener;

    invoke-virtual {p0, v7, v8}, Lroboguice/config/DefaultRoboModule;->bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V

    .line 172
    invoke-static {}, Lcom/google/inject/matcher/Matchers;->any()Lcom/google/inject/matcher/Matcher;

    move-result-object v7

    invoke-virtual {p0, v7, v6}, Lroboguice/config/DefaultRoboModule;->bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V

    .line 173
    invoke-static {}, Lcom/google/inject/matcher/Matchers;->any()Lcom/google/inject/matcher/Matcher;

    move-result-object v7

    new-instance v8, Lroboguice/event/ObservesTypeListener;

    const-class v9, Lroboguice/event/EventManager;

    invoke-virtual {p0, v9}, Lroboguice/config/DefaultRoboModule;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;

    move-result-object v9

    invoke-direct {v8, v9, v5}, Lroboguice/event/ObservesTypeListener;-><init>(Lcom/google/inject/Provider;Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;)V

    invoke-virtual {p0, v7, v8}, Lroboguice/config/DefaultRoboModule;->bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V

    .line 176
    invoke-virtual {p0, v5}, Lroboguice/config/DefaultRoboModule;->requestInjection(Ljava/lang/Object;)V

    .line 179
    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const-class v8, Lroboguice/util/Ln;

    aput-object v8, v7, v10

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->requestStaticInjection([Ljava/lang/Class;)V

    .line 182
    sget-object v7, Lroboguice/config/DefaultRoboModule;->fragmentManagerClass:Ljava/lang/Class;

    if-eqz v7, :cond_1

    .line 183
    sget-object v7, Lroboguice/config/DefaultRoboModule;->fragmentManagerClass:Ljava/lang/Class;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/FragmentManagerProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 188
    :cond_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v8, 0x5

    if-lt v7, v8, :cond_2

    .line 189
    sget-object v7, Lroboguice/config/DefaultRoboModule;->accountManagerClass:Ljava/lang/Class;

    invoke-virtual {p0, v7}, Lroboguice/config/DefaultRoboModule;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v7

    const-class v8, Lroboguice/inject/AccountManagerProvider;

    invoke-interface {v7, v8}, Lcom/google/inject/binder/AnnotatedBindingBuilder;->toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;

    .line 193
    :cond_2
    return-void

    .line 111
    .end local v4    # "info":Landroid/content/pm/PackageInfo;
    :catch_0
    move-exception v2

    .line 112
    .local v2, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v7, Ljava/lang/RuntimeException;

    invoke-direct {v7, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v7
.end method
