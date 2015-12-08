.class public final Lcom/facebook/Session$OpenRequest;
.super Lcom/facebook/Session$AuthorizationRequest;
.source "Session.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Session;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OpenRequest"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 2121
    invoke-direct {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;-><init>(Landroid/app/Activity;)V

    .line 2122
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;)V
    .locals 0
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 2130
    invoke-direct {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;-><init>(Landroid/support/v4/app/Fragment;)V

    .line 2131
    return-void
.end method


# virtual methods
.method public bridge synthetic setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;
    .locals 1

    .prologue
    .line 2112
    invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    return-object v0
.end method

.method public final setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    .locals 0
    .param p1, "statusCallback"    # Lcom/facebook/Session$StatusCallback;

    .prologue
    .line 2141
    invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$AuthorizationRequest;

    .line 2142
    return-object p0
.end method

.method public bridge synthetic setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;
    .locals 1

    .prologue
    .line 2112
    invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    return-object v0
.end method

.method public final setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$OpenRequest;
    .locals 0
    .param p1, "defaultAudience"    # Lcom/facebook/SessionDefaultAudience;

    .prologue
    .line 2205
    invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$AuthorizationRequest;

    .line 2206
    return-object p0
.end method

.method public bridge synthetic setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;
    .locals 1

    .prologue
    .line 2112
    invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    return-object v0
.end method

.method public final setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;
    .locals 0
    .param p1, "loginBehavior"    # Lcom/facebook/SessionLoginBehavior;

    .prologue
    .line 2154
    invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$AuthorizationRequest;

    .line 2155
    return-object p0
.end method

.method public bridge synthetic setPermissions(Ljava/util/List;)Lcom/facebook/Session$AuthorizationRequest;
    .locals 1

    .prologue
    .line 2112
    invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setPermissions([Ljava/lang/String;)Lcom/facebook/Session$AuthorizationRequest;
    .locals 1

    .prologue
    .line 2112
    invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setPermissions([Ljava/lang/String;)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    return-object v0
.end method

.method public final setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/Session$OpenRequest;"
        }
    .end annotation

    .prologue
    .line 2181
    .local p1, "permissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$AuthorizationRequest;

    .line 2182
    return-object p0
.end method

.method public final varargs setPermissions([Ljava/lang/String;)Lcom/facebook/Session$OpenRequest;
    .locals 0
    .param p1, "permissions"    # [Ljava/lang/String;

    .prologue
    .line 2192
    invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setPermissions([Ljava/lang/String;)Lcom/facebook/Session$AuthorizationRequest;

    .line 2193
    return-object p0
.end method

.method public bridge synthetic setRequestCode(I)Lcom/facebook/Session$AuthorizationRequest;
    .locals 1

    .prologue
    .line 2112
    invoke-virtual {p0, p1}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;

    move-result-object v0

    return-object v0
.end method

.method public final setRequestCode(I)Lcom/facebook/Session$OpenRequest;
    .locals 0
    .param p1, "requestCode"    # I

    .prologue
    .line 2168
    invoke-super {p0, p1}, Lcom/facebook/Session$AuthorizationRequest;->setRequestCode(I)Lcom/facebook/Session$AuthorizationRequest;

    .line 2169
    return-object p0
.end method
