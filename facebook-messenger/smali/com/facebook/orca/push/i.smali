.class public Lcom/facebook/orca/push/i;
.super Ljava/lang/Object;
.source "MessengerUserUtils.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Lcom/facebook/common/w/q;


# direct methods
.method public constructor <init>(ZZLcom/facebook/common/w/q;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-boolean p1, p0, Lcom/facebook/orca/push/i;->a:Z

    .line 35
    iput-boolean p2, p0, Lcom/facebook/orca/push/i;->b:Z

    .line 36
    iput-object p3, p0, Lcom/facebook/orca/push/i;->c:Lcom/facebook/common/w/q;

    .line 37
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 40
    iget-boolean v0, p0, Lcom/facebook/orca/push/i;->a:Z

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lcom/facebook/orca/push/i;->b:Z

    return v0
.end method
