.class public Lcom/facebook/orca/g/s;
.super Ljava/lang/Object;
.source "DbProperties.java"


# static fields
.field public static final a:Lcom/facebook/orca/g/x;

.field public static final b:Lcom/facebook/orca/g/x;

.field public static final c:Lcom/facebook/orca/g/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 12
    new-instance v0, Lcom/facebook/orca/g/x;

    const-string v1, "/sync/"

    invoke-direct {v0, v1}, Lcom/facebook/orca/g/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/g/s;->a:Lcom/facebook/orca/g/x;

    .line 26
    new-instance v0, Lcom/facebook/orca/g/x;

    const-string v1, "/sync/last_thread_fetch_action_id/"

    invoke-direct {v0, v1}, Lcom/facebook/orca/g/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/orca/g/s;->b:Lcom/facebook/orca/g/x;

    .line 31
    sget-object v0, Lcom/facebook/orca/g/s;->a:Lcom/facebook/orca/g/x;

    const-string v1, "/last_get_top_groups_fetch_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    sput-object v0, Lcom/facebook/orca/g/s;->c:Lcom/facebook/orca/g/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/facebook/orca/g/s;->a:Lcom/facebook/orca/g/x;

    invoke-virtual {p0}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    const-string v1, "/last_get_threads_client_time_ms"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    return-object v0
.end method

.method public static final a(Ljava/lang/String;)Lcom/facebook/orca/g/x;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/orca/g/s;->b:Lcom/facebook/orca/g/x;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    return-object v0
.end method

.method public static final b(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;
    .locals 2

    .prologue
    .line 19
    sget-object v0, Lcom/facebook/orca/g/s;->a:Lcom/facebook/orca/g/x;

    invoke-virtual {p0}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    const-string v1, "/last_get_threads_action_id"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    return-object v0
.end method

.method public static final c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/g/x;
    .locals 2

    .prologue
    .line 23
    sget-object v0, Lcom/facebook/orca/g/s;->a:Lcom/facebook/orca/g/x;

    invoke-virtual {p0}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    const-string v1, "/threads_table_out_of_date"

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/x;->c(Ljava/lang/String;)Lcom/facebook/common/s/a;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/g/x;

    return-object v0
.end method
