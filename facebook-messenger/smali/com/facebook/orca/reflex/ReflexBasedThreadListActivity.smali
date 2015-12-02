.class public Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;
.super Lcom/facebook/reflex/e;
.source "ReflexBasedThreadListActivity.java"

# interfaces
.implements Lcom/facebook/orca/activity/k;
.implements Lcom/facebook/orca/threadlist/s;


# static fields
.field private static final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Lcom/facebook/orca/threadlist/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->d:Ljava/util/HashMap;

    .line 25
    sget-object v0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->d:Ljava/util/HashMap;

    const-class v1, Lcom/facebook/orca/common/ui/overlay/SwipableOverlayLayout;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/i;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->d:Ljava/util/HashMap;

    const-class v1, Lcom/facebook/orca/threadlist/ThreadListView;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/reflex/k;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    new-instance v0, Lcom/facebook/orca/threadlist/t;

    invoke-direct {v0}, Lcom/facebook/orca/threadlist/t;-><init>()V

    invoke-direct {p0, v0}, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;-><init>(Lcom/facebook/orca/threadlist/t;)V

    .line 35
    return-void
.end method

.method private constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/reflex/e;-><init>(Lcom/facebook/base/activity/l;)V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->c:Lcom/facebook/orca/threadlist/t;

    .line 40
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadlist/t;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->c:Lcom/facebook/orca/threadlist/t;

    return-object v0
.end method

.method protected a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 68
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/reflex/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 44
    invoke-super {p0, p1}, Lcom/facebook/reflex/e;->a(Landroid/os/Bundle;)V

    .line 47
    sget-object v0, Lcom/facebook/reflex/view/b/g;->HorizontalPans:Lcom/facebook/reflex/view/b/g;

    sget-object v1, Lcom/facebook/reflex/view/b/g;->Taps:Lcom/facebook/reflex/view/b/g;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->a(Ljava/util/EnumSet;)V

    .line 49
    return-void
.end method

.method public c()Lcom/facebook/orca/common/ui/titlebar/a;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/reflex/ReflexBasedThreadListActivity;->c:Lcom/facebook/orca/threadlist/t;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/t;->c()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    return-object v0
.end method

.method public c_()Z
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    return v0
.end method
