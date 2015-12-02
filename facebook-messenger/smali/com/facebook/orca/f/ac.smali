.class public Lcom/facebook/orca/f/ac;
.super Lcom/facebook/orca/f/d;
.source "ThreadLocationPrefManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/f/d",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/orca/f/ac;

    sput-object v0, Lcom/facebook/orca/f/ac;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/f/k;Lcom/facebook/orca/f/z;Lcom/facebook/common/e/h;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct/range {p0 .. p5}, Lcom/facebook/orca/f/d;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/f/k;Lcom/facebook/orca/f/z;Lcom/facebook/common/e/h;Lcom/facebook/common/time/a;)V

    .line 38
    iput-object p4, p0, Lcom/facebook/orca/f/ac;->b:Lcom/facebook/common/e/h;

    .line 39
    return-void
.end method


# virtual methods
.method protected a(Lcom/facebook/user/UserKey;)Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 99
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/ac;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    if-nez p1, :cond_0

    .line 67
    const/4 v0, 0x0

    .line 69
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "1"

    goto :goto_0

    :cond_1
    const-string v0, "0"

    goto :goto_0
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/ac;->a(Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/common/w/q;)V
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p2}, Lcom/facebook/common/w/q;->asBooleanObject()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/f/ac;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method protected b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 94
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->b(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/ac;->c(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/common/w/q;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/ac;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 50
    invoke-static {v0}, Lcom/facebook/common/w/q;->valueOf(Ljava/lang/Boolean;)Lcom/facebook/common/w/q;

    move-result-object v0

    return-object v0
.end method

.method protected c(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 85
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 86
    check-cast p1, Ljava/lang/Boolean;

    .line 89
    :goto_0
    return-object p1

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/f/ac;->b:Lcom/facebook/common/e/h;

    sget-object v1, Lcom/facebook/orca/f/ac;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unknown value type"

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0
.end method

.method protected c(Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 75
    if-nez p1, :cond_0

    .line 76
    const/4 v0, 0x0

    .line 78
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method
