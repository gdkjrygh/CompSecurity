.class public Lcom/facebook/orca/prefs/an;
.super Lcom/facebook/widget/c/d;
.source "OrcaReflexThreadListPreference.java"


# static fields
.field private static final a:Lcom/facebook/prefs/shared/ae;

.field private static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/CharSequence;",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 23
    sget-object v0, Lcom/facebook/prefs/shared/aj;->b:Lcom/facebook/prefs/shared/ae;

    const-string v1, "reflex_thread_list_state"

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/ae;

    sput-object v0, Lcom/facebook/orca/prefs/an;->a:Lcom/facebook/prefs/shared/ae;

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    .line 32
    sget-object v0, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    const-string v1, "Use GateKeeper settings"

    sget-object v2, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    const-string v1, "Force enable"

    sget-object v2, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    sget-object v0, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    const-string v1, "Force disable"

    sget-object v2, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/d;-><init>(Landroid/content/Context;)V

    .line 40
    sget-object v0, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/CharSequence;

    .line 41
    sget-object v1, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 43
    const-string v1, "Reflex settings"

    invoke-virtual {p0, v1}, Lcom/facebook/orca/prefs/an;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 44
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/an;->setEntries([Ljava/lang/CharSequence;)V

    .line 45
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/an;->setEntryValues([Ljava/lang/CharSequence;)V

    .line 47
    const-string v0, "Enable/Disable Reflex in ThreadList"

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/an;->setTitle(Ljava/lang/CharSequence;)V

    .line 48
    const-string v0, "Restart is required for settings to take effect"

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/an;->setSummary(Ljava/lang/CharSequence;)V

    .line 49
    const-string v0, "Cancel"

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/an;->setNegativeButtonText(Ljava/lang/CharSequence;)V

    .line 50
    sget-object v0, Lcom/facebook/orca/prefs/an;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/an;->a(Lcom/facebook/prefs/shared/ae;)V

    .line 51
    return-void
.end method

.method public static a(Lcom/facebook/prefs/shared/d;)Lcom/facebook/common/w/q;
    .locals 3

    .prologue
    .line 54
    const-string v0, "Use GateKeeper settings"

    .line 56
    :try_start_0
    sget-object v1, Lcom/facebook/orca/prefs/an;->a:Lcom/facebook/prefs/shared/ae;

    const-string v2, "Use GateKeeper settings"

    invoke-interface {p0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 60
    :goto_0
    sget-object v1, Lcom/facebook/orca/prefs/an;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    return-object v0

    .line 57
    :catch_0
    move-exception v1

    goto :goto_0
.end method
