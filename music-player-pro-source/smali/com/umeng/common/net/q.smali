.class Lcom/umeng/common/net/q;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Ljava/io/File;


# direct methods
.method constructor <init>(Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/common/net/q;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/umeng/common/net/q;->a:Ljava/io/File;

    invoke-static {v0}, Lcom/umeng/common/net/p;->a(Ljava/io/File;)V

    return-void
.end method
