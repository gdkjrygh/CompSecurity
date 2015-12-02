.class Lcom/facebook/orca/threadview/cv;
.super Lcom/google/android/maps/OverlayItem;
.source "ThreadViewMapActivityImpl.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;

.field private final b:Lcom/facebook/user/UserKey;

.field private final c:F

.field private final d:Lcom/facebook/messages/model/threads/Message;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;Lcom/google/android/maps/GeoPoint;FLjava/lang/String;Ljava/lang/String;Lcom/facebook/user/UserKey;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 319
    iput-object p1, p0, Lcom/facebook/orca/threadview/cv;->a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;

    .line 320
    invoke-direct {p0, p2, p4, p5}, Lcom/google/android/maps/OverlayItem;-><init>(Lcom/google/android/maps/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    iput-object p6, p0, Lcom/facebook/orca/threadview/cv;->b:Lcom/facebook/user/UserKey;

    .line 322
    iput p3, p0, Lcom/facebook/orca/threadview/cv;->c:F

    .line 323
    iput-object p7, p0, Lcom/facebook/orca/threadview/cv;->d:Lcom/facebook/messages/model/threads/Message;

    .line 324
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserKey;
    .locals 1

    .prologue
    .line 327
    iget-object v0, p0, Lcom/facebook/orca/threadview/cv;->b:Lcom/facebook/user/UserKey;

    return-object v0
.end method

.method public b()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/facebook/orca/threadview/cv;->d:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public c()F
    .locals 1

    .prologue
    .line 335
    iget v0, p0, Lcom/facebook/orca/threadview/cv;->c:F

    return v0
.end method
