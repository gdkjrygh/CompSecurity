.class public Lcom/facebook/orca/photos/view/b;
.super Ljava/lang/Object;
.source "PhotoMessageItem.java"


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Lcom/facebook/messages/model/threads/Message;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/orca/photos/view/b;->a:Landroid/net/Uri;

    .line 20
    iput-object p2, p0, Lcom/facebook/orca/photos/view/b;->b:Lcom/facebook/messages/model/threads/Message;

    .line 21
    iput-object p3, p0, Lcom/facebook/orca/photos/view/b;->c:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/photos/view/b;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public b()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/photos/view/b;->b:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/photos/view/b;->c:Ljava/lang/String;

    return-object v0
.end method
