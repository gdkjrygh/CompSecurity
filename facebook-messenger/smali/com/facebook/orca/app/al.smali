.class Lcom/facebook/orca/app/al;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/c/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1576
    iput-object p1, p0, Lcom/facebook/orca/app/al;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1576
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/al;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/c/a;
    .locals 5

    .prologue
    .line 1580
    new-instance v2, Lcom/facebook/common/c/a;

    const-class v0, Landroid/content/pm/PackageInfo;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/al;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/common/annotations/IsDebugLogsEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/app/al;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/common/c/a;-><init>(Landroid/content/pm/PackageInfo;Lcom/facebook/prefs/shared/d;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1576
    invoke-virtual {p0}, Lcom/facebook/orca/app/al;->a()Lcom/facebook/common/c/a;

    move-result-object v0

    return-object v0
.end method
