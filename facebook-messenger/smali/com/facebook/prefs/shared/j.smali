.class public Lcom/facebook/prefs/shared/j;
.super Ljava/lang/Object;
.source "FbSharedPreferencesImpl.java"

# interfaces
.implements Lcom/facebook/prefs/shared/d;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:[Ljava/lang/String;

.field private static final y:Ljava/lang/Object;


# instance fields
.field private final g:Landroid/content/Context;

.field private final h:Landroid/content/ContentResolver;

.field private final i:Lcom/facebook/common/executors/a;

.field private final j:Lcom/facebook/prefs/shared/h;

.field private final k:Lcom/facebook/common/e/h;

.field private l:Landroid/content/SharedPreferences;

.field private final m:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final p:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/f;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private s:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private t:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final u:Ljava/lang/Object;

.field private v:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "syncLock"
    .end annotation
.end field

.field private final w:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

.field private final x:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 76
    const-class v0, Lcom/facebook/prefs/shared/d;

    sput-object v0, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_NULL_PREF"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/j;->b:Ljava/lang/String;

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_NULL_PROVIDER"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/j;->c:Ljava/lang/String;

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_PROVIDER_REMOTE_EXCEPTION"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/j;->d:Ljava/lang/String;

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_NULL_CURSOR"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/prefs/shared/j;->e:Ljava/lang/String;

    .line 92
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "key"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "type"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "value"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/prefs/shared/j;->f:[Ljava/lang/String;

    .line 368
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ContentResolver;Lcom/facebook/common/executors/a;Landroid/content/SharedPreferences;Lcom/facebook/prefs/shared/h;Lcom/facebook/common/e/h;)V
    .locals 2
    .param p4    # Landroid/content/SharedPreferences;
        .annotation runtime Lcom/facebook/prefs/shared/DefaultSharedPreferences;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/prefs/shared/j;->u:Ljava/lang/Object;

    .line 143
    const-string v0, "FbSharedPreferences.ctor"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 144
    iput-object p1, p0, Lcom/facebook/prefs/shared/j;->g:Landroid/content/Context;

    .line 145
    iput-object p2, p0, Lcom/facebook/prefs/shared/j;->h:Landroid/content/ContentResolver;

    .line 146
    iput-object p3, p0, Lcom/facebook/prefs/shared/j;->i:Lcom/facebook/common/executors/a;

    .line 147
    iput-object p5, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    .line 148
    iput-object p6, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    .line 149
    invoke-static {}, Lcom/google/common/a/ik;->d()Ljava/util/TreeMap;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    .line 150
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->n:Ljava/util/Map;

    .line 151
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->o:Ljava/util/Set;

    .line 152
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->p:Ljava/util/Set;

    .line 153
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->q:Ljava/util/Map;

    .line 154
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->r:Ljava/util/List;

    .line 155
    iput-object p4, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    .line 156
    new-instance v1, Lcom/facebook/prefs/shared/k;

    invoke-direct {v1, p0}, Lcom/facebook/prefs/shared/k;-><init>(Lcom/facebook/prefs/shared/j;)V

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->w:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 162
    new-instance v1, Lcom/facebook/prefs/shared/l;

    invoke-direct {v1, p0}, Lcom/facebook/prefs/shared/l;-><init>(Lcom/facebook/prefs/shared/j;)V

    iput-object v1, p0, Lcom/facebook/prefs/shared/j;->x:Landroid/content/BroadcastReceiver;

    .line 170
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 171
    return-void
.end method

.method private a(Ljava/util/Map;Ljava/util/Map;)Lcom/google/common/a/ev;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 944
    invoke-static {p1, p2}, Lcom/google/common/a/ik;->a(Ljava/util/Map;Ljava/util/Map;)Lcom/google/common/a/hw;

    move-result-object v0

    .line 945
    invoke-interface {v0}, Lcom/google/common/a/hw;->a()Ljava/util/Map;

    move-result-object v1

    .line 946
    invoke-interface {v0}, Lcom/google/common/a/hw;->b()Ljava/util/Map;

    move-result-object v2

    .line 947
    invoke-interface {v0}, Lcom/google/common/a/hw;->d()Ljava/util/Map;

    move-result-object v3

    .line 951
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v4

    .line 952
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 953
    sget-object v5, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    invoke-virtual {v4, v0, v5}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 955
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 956
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 959
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 960
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/hx;

    invoke-interface {v0}, Lcom/google/common/a/hx;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_2

    .line 962
    :cond_2
    invoke-virtual {v4}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/j;)Ljava/util/List;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->r:Ljava/util/List;

    return-object v0
.end method

.method private a(Landroid/content/SharedPreferences$Editor;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences$Editor;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 890
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 891
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 892
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 893
    sget-object v3, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    if-ne v0, v3, :cond_1

    .line 894
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 896
    :cond_1
    if-eqz v0, :cond_0

    .line 897
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 898
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 899
    :cond_2
    instance-of v3, v0, Ljava/lang/Boolean;

    if-eqz v3, :cond_3

    .line 900
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 901
    :cond_3
    instance-of v3, v0, Ljava/lang/Integer;

    if-eqz v3, :cond_4

    .line 902
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 903
    :cond_4
    instance-of v3, v0, Ljava/lang/Long;

    if-eqz v3, :cond_5

    .line 904
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-interface {p1, v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 905
    :cond_5
    instance-of v3, v0, Ljava/lang/Float;

    if-eqz v3, :cond_6

    .line 906
    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 907
    :cond_6
    instance-of v0, v0, Ljava/lang/Double;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 914
    :cond_7
    return-void
.end method

.method private a(Landroid/database/Cursor;Ljava/util/Set;Ljava/util/Map;)V
    .locals 7
    .param p2    # Ljava/util/Set;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 314
    const-string v0, "key"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 315
    const-string v0, "type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 316
    const-string v0, "value"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 317
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 318
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 319
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 320
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 322
    :pswitch_0
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 326
    :pswitch_1
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 330
    :pswitch_2
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 334
    :pswitch_3
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 338
    :pswitch_4
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 342
    :pswitch_5
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 346
    :cond_1
    return-void

    .line 320
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/j;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/j;->g(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/j;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/j;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/j;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/j;Ljava/util/Map;Z)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Map;Z)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 361
    monitor-enter p0

    .line 362
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->p:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 363
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 364
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->i()V

    .line 365
    return-void

    .line 363
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 349
    monitor-enter p0

    .line 350
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->o:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 351
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 352
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->i()V

    .line 353
    return-void

    .line 351
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v10, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 801
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 885
    :cond_0
    return-void

    .line 805
    :cond_1
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 806
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 807
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 808
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 809
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 810
    iget-object v8, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v8}, Lcom/facebook/prefs/shared/h;->b()Landroid/net/Uri;

    move-result-object v8

    .line 811
    sget-object v9, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    if-ne v0, v9, :cond_2

    .line 812
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "key/"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 814
    invoke-static {v0}, Landroid/content/ContentProviderOperation;->newDelete(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 819
    :cond_2
    const-string v9, "key"

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v9, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 821
    const-string v1, "type"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 822
    const-string v1, "value"

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    :cond_3
    :goto_1
    invoke-static {v8}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/ContentProviderOperation$Builder;->withValues(Landroid/content/ContentValues;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 823
    :cond_4
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    .line 824
    const-string v1, "type"

    const/4 v9, 0x2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 825
    const-string v1, "value"

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v2

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    :cond_5
    move v0, v3

    goto :goto_2

    .line 826
    :cond_6
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_7

    .line 827
    const-string v1, "type"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 828
    const-string v1, "value"

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 829
    :cond_7
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_8

    .line 830
    const-string v1, "type"

    const/4 v9, 0x4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 831
    const-string v1, "value"

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_1

    .line 832
    :cond_8
    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_9

    .line 833
    const-string v1, "type"

    const/4 v9, 0x5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 834
    const-string v1, "value"

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    goto :goto_1

    .line 835
    :cond_9
    instance-of v1, v0, Ljava/lang/Double;

    if-eqz v1, :cond_3

    .line 836
    const-string v1, "type"

    const/4 v9, 0x6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v1, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 837
    const-string v1, "value"

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v6, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    goto/16 :goto_1

    :cond_a
    move-object v0, v4

    .line 848
    :goto_3
    if-ge v3, v10, :cond_b

    .line 850
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->h:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_0
    .catch Landroid/content/OperationApplicationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v0, v4

    .line 882
    :cond_b
    if-eqz v0, :cond_0

    .line 883
    invoke-static {v0}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 856
    :catch_0
    move-exception v0

    .line 858
    invoke-static {v0}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 859
    :catch_1
    move-exception v0

    .line 868
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    .line 871
    :try_start_1
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 872
    invoke-virtual {v1}, Landroid/os/Parcel;->dataSize()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    .line 874
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 877
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    sget-object v6, Lcom/facebook/prefs/shared/j;->d:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Attempt "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " to apply changes failed. Operations size: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v6, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 848
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 874
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method

.method private a(Ljava/util/Map;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 604
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 641
    :goto_0
    return-void

    .line 608
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lcom/google/common/a/hq;->c(I)Ljava/util/ArrayList;

    move-result-object v2

    .line 609
    monitor-enter p0

    .line 611
    :try_start_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 612
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/ae;

    .line 613
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 614
    sget-object v4, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    if-ne v0, v4, :cond_2

    .line 615
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 616
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 618
    :cond_1
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 632
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 620
    :cond_2
    :try_start_1
    iget-object v4, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v4, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 621
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 623
    :cond_3
    iget-object v4, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v4, v1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 628
    :cond_4
    if-eqz p2, :cond_5

    .line 629
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->n:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 630
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->i()V

    .line 632
    :cond_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 635
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->i:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/prefs/shared/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/prefs/shared/n;-><init>(Lcom/facebook/prefs/shared/j;Ljava/util/List;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private a(Ljava/util/Set;Ljava/util/Map;)V
    .locals 8
    .param p1    # Ljava/util/Set;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 231
    .line 232
    if-eqz p1, :cond_8

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "key IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->b(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 236
    :goto_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->h:Landroid/content/ContentResolver;

    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/h;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->acquireContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object v0

    .line 239
    if-nez v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/prefs/shared/j;->c:Ljava/lang/String;

    const-string v2, "Failed to acquire content provider client."

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    :goto_1
    return-void

    .line 250
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v1}, Lcom/facebook/prefs/shared/h;->b()Landroid/net/Uri;

    move-result-object v1

    sget-object v2, Lcom/facebook/prefs/shared/j;->f:[Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v6

    .line 294
    if-nez v6, :cond_6

    .line 295
    :try_start_1
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    sget-object v2, Lcom/facebook/prefs/shared/j;->e:Ljava/lang/String;

    const-string v3, "Null cursor."

    invoke-interface {v1, v2, v3}, Lcom/facebook/common/e/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 302
    if-eqz v6, :cond_1

    .line 303
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 305
    :cond_1
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    goto :goto_1

    .line 257
    :catch_0
    move-exception v1

    .line 258
    if-eqz v3, :cond_4

    .line 270
    :try_start_2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result-object v2

    .line 273
    :try_start_3
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 274
    invoke-virtual {v2}, Landroid/os/Parcel;->dataSize()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v3

    .line 276
    :try_start_4
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 279
    iget-object v2, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/prefs/shared/j;->d:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to perform query. Where clause size: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4, v3, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 282
    const/4 v1, 0x0

    invoke-direct {p0, v1, p2}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Set;Ljava/util/Map;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 302
    if-eqz v6, :cond_2

    .line 303
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 305
    :cond_2
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    goto :goto_1

    .line 276
    :catchall_0
    move-exception v1

    :try_start_5
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 302
    :catchall_1
    move-exception v1

    if-eqz v6, :cond_3

    .line 303
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 305
    :cond_3
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    throw v1

    .line 286
    :cond_4
    :try_start_6
    iget-object v2, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/prefs/shared/j;->d:Ljava/lang/String;

    const-string v4, "Failed to query."

    invoke-interface {v2, v3, v4, v1}, Lcom/facebook/common/e/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 302
    if-eqz v6, :cond_5

    .line 303
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 305
    :cond_5
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    goto :goto_1

    .line 299
    :cond_6
    :try_start_7
    invoke-direct {p0, v6, p1, p2}, Lcom/facebook/prefs/shared/j;->a(Landroid/database/Cursor;Ljava/util/Set;Ljava/util/Map;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 302
    if-eqz v6, :cond_7

    .line 303
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 305
    :cond_7
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    goto/16 :goto_1

    :cond_8
    move-object v3, v6

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/j;Z)Z
    .locals 0

    .prologue
    .line 74
    iput-boolean p1, p0, Lcom/facebook/prefs/shared/j;->t:Z

    return p1
.end method

.method private b(Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;)",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 973
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v2

    .line 974
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    .line 975
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v4, v1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 977
    :cond_0
    return-object v2
.end method

.method static synthetic b(Lcom/facebook/prefs/shared/j;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->j()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/prefs/shared/j;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/j;->b(Ljava/util/List;)V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 645
    monitor-enter p0

    .line 647
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v2

    .line 648
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 650
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 651
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/f;

    .line 652
    if-eqz v1, :cond_1

    .line 653
    invoke-interface {v1, p0, v0}, Lcom/facebook/prefs/shared/f;->a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V

    goto :goto_0

    .line 648
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 657
    :cond_2
    return-void
.end method

.method static synthetic f()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 74
    sget-object v0, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    sget-object v0, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    return-object v0
.end method

.method private g(Lcom/facebook/prefs/shared/ae;)V
    .locals 4

    .prologue
    .line 475
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->k:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/prefs/shared/j;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Wrote null pref to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    return-void
.end method

.method private declared-synchronized h(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/ae;",
            ")",
            "Ljava/util/SortedMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 554
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 555
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-static {v0, p1}, Lcom/facebook/prefs/shared/af;->a(Ljava/util/SortedMap;Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 554
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 224
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-direct {p0, v0, v1}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Set;Ljava/util/Map;)V

    .line 225
    return-void
.end method

.method private declared-synchronized i()V
    .locals 2

    .prologue
    .line 660
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/prefs/shared/j;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 673
    :goto_0
    monitor-exit p0

    return-void

    .line 663
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->i:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/prefs/shared/o;

    invoke-direct {v1, p0}, Lcom/facebook/prefs/shared/o;-><init>(Lcom/facebook/prefs/shared/j;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->c(Ljava/lang/Runnable;)V

    .line 672
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/prefs/shared/j;->t:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 660
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private j()V
    .locals 4

    .prologue
    .line 688
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->u:Ljava/lang/Object;

    monitor-enter v1

    .line 689
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/prefs/shared/j;->v:Z

    if-nez v0, :cond_0

    .line 690
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->n()V

    .line 691
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/prefs/shared/j;->v:Z

    .line 692
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    iget-object v2, p0, Lcom/facebook/prefs/shared/j;->w:Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 698
    :cond_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->k()Lcom/google/common/a/ev;

    move-result-object v0

    .line 699
    invoke-direct {p0, v0}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Map;)V

    .line 702
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->l()Lcom/google/common/a/ev;

    move-result-object v2

    .line 703
    const/4 v3, 0x0

    invoke-direct {p0, v2, v3}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Map;Z)V

    .line 706
    iget-object v3, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 707
    invoke-direct {p0, v3, v0}, Lcom/facebook/prefs/shared/j;->a(Landroid/content/SharedPreferences$Editor;Ljava/util/Map;)V

    .line 708
    invoke-direct {p0, v3, v2}, Lcom/facebook/prefs/shared/j;->a(Landroid/content/SharedPreferences$Editor;Ljava/util/Map;)V

    .line 709
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 712
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->m()Lcom/google/common/a/ev;

    move-result-object v0

    .line 713
    const/4 v2, 0x1

    invoke-direct {p0, v0, v2}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Map;Z)V

    .line 714
    monitor-exit v1

    .line 715
    return-void

    .line 714
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private declared-synchronized k()Lcom/google/common/a/ev;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 724
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->n:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 725
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 729
    :goto_0
    monitor-exit p0

    return-object v0

    .line 727
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->n:Ljava/util/Map;

    invoke-static {v0}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    .line 728
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->n:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 724
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private l()Lcom/google/common/a/ev;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 740
    monitor-enter p0

    .line 741
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->o:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 742
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object v0

    monitor-exit p0

    .line 761
    :goto_0
    return-object v0

    .line 744
    :cond_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->o:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v1

    .line 745
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->o:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 748
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v2

    .line 749
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 750
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    .line 751
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 752
    if-eqz v0, :cond_1

    .line 753
    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 756
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 758
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 759
    invoke-direct {p0, v1, v0}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Set;Ljava/util/Map;)V

    .line 761
    invoke-direct {p0, v2, v0}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Map;Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    goto :goto_0
.end method

.method private declared-synchronized m()Lcom/google/common/a/ev;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 770
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->p:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 771
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 792
    :goto_0
    monitor-exit p0

    return-object v0

    .line 773
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->p:Ljava/util/Set;

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v0

    .line 774
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->p:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 776
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 777
    iget-object v2, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v2

    .line 778
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 779
    new-instance v4, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v4, v0}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    .line 780
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 781
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, v4}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 782
    sget-object v0, Lcom/facebook/prefs/shared/j;->y:Ljava/lang/Object;

    invoke-virtual {v1, v4, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 770
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 785
    :cond_2
    :try_start_2
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 786
    iget-object v5, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v5, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 787
    invoke-static {v5, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 788
    invoke-virtual {v1, v4, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_1

    .line 792
    :cond_3
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    goto :goto_0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 918
    monitor-enter p0

    .line 919
    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-static {v0}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v0

    .line 920
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 921
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/prefs/shared/j;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 924
    invoke-direct {p0, v1, v0}, Lcom/facebook/prefs/shared/j;->a(Ljava/util/Map;Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    .line 927
    iget-object v1, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 928
    invoke-direct {p0, v1, v0}, Lcom/facebook/prefs/shared/j;->a(Landroid/content/SharedPreferences$Editor;Ljava/util/Map;)V

    .line 929
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 930
    return-void

    .line 920
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private declared-synchronized o()V
    .locals 2

    .prologue
    .line 996
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/prefs/shared/j;->s:Z

    const-string v1, "FbSharedPreferences used before initialized"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 997
    monitor-exit p0

    return-void

    .line 996
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;F)F
    .locals 1

    .prologue
    .line 525
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 526
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    .line 527
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result p2

    :cond_0
    monitor-exit p0

    return p2

    .line 525
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;I)I
    .locals 1

    .prologue
    .line 511
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 512
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 513
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result p2

    :cond_0
    monitor-exit p0

    return p2

    .line 511
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;J)J
    .locals 1

    .prologue
    .line 518
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 519
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    .line 520
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide p2

    :cond_0
    monitor-exit p0

    return-wide p2

    .line 518
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 489
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 490
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 491
    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    move-object v0, p2

    goto :goto_0

    .line 489
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/f;)V
    .locals 2

    .prologue
    .line 567
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->q:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    monitor-exit p0

    return-void

    .line 567
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 578
    monitor-enter p0

    .line 579
    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/prefs/shared/j;->s:Z

    if-eqz v0, :cond_0

    .line 580
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->i:Lcom/facebook/common/executors/a;

    invoke-interface {v0, p1}, Lcom/facebook/common/executors/a;->d(Ljava/lang/Runnable;)V

    .line 584
    :goto_0
    monitor-exit p0

    .line 585
    return-void

    .line 582
    :cond_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 584
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 985
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/j;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 986
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->l:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 987
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    .line 988
    invoke-interface {v1, v0}, Lcom/facebook/prefs/shared/e;->b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    .line 989
    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 991
    :cond_0
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 992
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 993
    return-void
.end method

.method public declared-synchronized a()Z
    .locals 1

    .prologue
    .line 175
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/prefs/shared/j;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;)Z
    .locals 1

    .prologue
    .line 483
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 484
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    .line 483
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/prefs/shared/ae;Z)Z
    .locals 1

    .prologue
    .line 496
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 497
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 498
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result p2

    :cond_0
    monitor-exit p0

    return p2

    .line 496
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 503
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 504
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 505
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/facebook/common/w/q;->valueOf(Ljava/lang/Boolean;)Lcom/facebook/common/w/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 503
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()Lcom/facebook/prefs/shared/e;
    .locals 1

    .prologue
    .line 560
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 561
    new-instance v0, Lcom/facebook/prefs/shared/p;

    invoke-direct {v0, p0}, Lcom/facebook/prefs/shared/p;-><init>(Lcom/facebook/prefs/shared/j;)V

    return-object v0
.end method

.method public declared-synchronized b(Lcom/facebook/prefs/shared/f;)V
    .locals 1

    .prologue
    .line 573
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 574
    monitor-exit p0

    return-void

    .line 573
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c(Lcom/facebook/prefs/shared/ae;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 539
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 540
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    .line 539
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 1

    .prologue
    .line 593
    monitor-enter p0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/prefs/shared/j;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 596
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 593
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 598
    :cond_0
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized d(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/ae;",
            ")",
            "Ljava/util/SortedSet",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            ">;"
        }
    .end annotation

    .prologue
    .line 545
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/j;->h(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/kl;->b(Ljava/lang/Iterable;)Ljava/util/TreeSet;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()V
    .locals 7

    .prologue
    .line 179
    monitor-enter p0

    :try_start_0
    const-string v0, "FbSharedPreferences.initialize"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 181
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/prefs/shared/j;->s:Z

    .line 183
    const-string v1, "#register"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 184
    new-instance v2, Landroid/content/IntentFilter;

    iget-object v3, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v3}, Lcom/facebook/prefs/shared/h;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 185
    iget-object v3, p0, Lcom/facebook/prefs/shared/j;->j:Lcom/facebook/prefs/shared/h;

    invoke-virtual {v3}, Lcom/facebook/prefs/shared/h;->e()Ljava/lang/String;

    move-result-object v3

    .line 186
    if-eqz v3, :cond_0

    .line 187
    iget-object v4, p0, Lcom/facebook/prefs/shared/j;->g:Landroid/content/Context;

    iget-object v5, p0, Lcom/facebook/prefs/shared/j;->x:Landroid/content/BroadcastReceiver;

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v2, v3, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 192
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 194
    const-string v1, "#loadInitialValues"

    invoke-static {v1}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 195
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->h()V

    .line 196
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 198
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->i()V

    .line 199
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 202
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->i:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/prefs/shared/m;

    invoke-direct {v1, p0}, Lcom/facebook/prefs/shared/m;-><init>(Lcom/facebook/prefs/shared/j;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    monitor-exit p0

    return-void

    .line 190
    :cond_0
    :try_start_1
    iget-object v3, p0, Lcom/facebook/prefs/shared/j;->g:Landroid/content/Context;

    iget-object v4, p0, Lcom/facebook/prefs/shared/j;->x:Landroid/content/BroadcastReceiver;

    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 179
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public synthetic e(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;
    .locals 1

    .prologue
    .line 73
    invoke-virtual {p0, p1}, Lcom/facebook/prefs/shared/j;->f(Lcom/facebook/prefs/shared/ae;)Ljava/util/TreeMap;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 5

    .prologue
    .line 966
    invoke-direct {p0}, Lcom/facebook/prefs/shared/j;->o()V

    .line 967
    iget-object v0, p0, Lcom/facebook/prefs/shared/j;->m:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 968
    sget-object v2, Lcom/facebook/prefs/shared/j;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Pref: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 970
    :cond_0
    return-void
.end method

.method public declared-synchronized f(Lcom/facebook/prefs/shared/ae;)Ljava/util/TreeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/ae;",
            ")",
            "Ljava/util/TreeMap",
            "<",
            "Lcom/facebook/prefs/shared/ae;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 550
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/prefs/shared/j;->h(Lcom/facebook/prefs/shared/ae;)Ljava/util/SortedMap;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/ik;->a(Ljava/util/SortedMap;)Ljava/util/TreeMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
