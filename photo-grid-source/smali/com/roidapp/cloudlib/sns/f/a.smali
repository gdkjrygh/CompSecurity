.class public Lcom/roidapp/cloudlib/sns/f/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/f/b;


# static fields
.field private static a:Lcom/roidapp/cloudlib/sns/f/a;


# instance fields
.field private b:Lcom/roidapp/cloudlib/sns/f/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/roidapp/cloudlib/sns/f/a;
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/roidapp/cloudlib/sns/f/a;->a:Lcom/roidapp/cloudlib/sns/f/a;

    if-nez v0, :cond_1

    .line 16
    const-class v1, Lcom/roidapp/cloudlib/sns/f/a;

    monitor-enter v1

    .line 17
    :try_start_0
    sget-object v0, Lcom/roidapp/cloudlib/sns/f/a;->a:Lcom/roidapp/cloudlib/sns/f/a;

    if-nez v0, :cond_0

    .line 18
    new-instance v0, Lcom/roidapp/cloudlib/sns/f/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/f/a;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/f/a;->a:Lcom/roidapp/cloudlib/sns/f/a;

    .line 20
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/f/a;->a:Lcom/roidapp/cloudlib/sns/f/a;

    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/sns/f/b;)V
    .locals 0

    .prologue
    .line 26
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/f/a;->b:Lcom/roidapp/cloudlib/sns/f/b;

    .line 27
    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/f/a;->b:Lcom/roidapp/cloudlib/sns/f/b;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/cloudlib/sns/f/b;->a(Ljava/lang/String;I)V

    .line 33
    return-void
.end method
