.class final Lcom/kik/cards/usermedia/p;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/q;

.field final synthetic b:Lcom/kik/cards/usermedia/o;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/o;Lcom/kik/cards/usermedia/q;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Lcom/kik/cards/usermedia/p;->b:Lcom/kik/cards/usermedia/o;

    iput-object p2, p0, Lcom/kik/cards/usermedia/p;->a:Lcom/kik/cards/usermedia/q;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 143
    iget-object v0, p0, Lcom/kik/cards/usermedia/p;->b:Lcom/kik/cards/usermedia/o;

    invoke-static {v0}, Lcom/kik/cards/usermedia/o;->a(Lcom/kik/cards/usermedia/o;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 144
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/usermedia/p;->b:Lcom/kik/cards/usermedia/o;

    invoke-static {v0}, Lcom/kik/cards/usermedia/o;->a(Lcom/kik/cards/usermedia/o;)Ljava/util/Map;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/cards/usermedia/p;->a:Lcom/kik/cards/usermedia/q;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
