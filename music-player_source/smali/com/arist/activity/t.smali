.class final Lcom/arist/activity/t;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ijoysoft/appwall/c;


# instance fields
.field final synthetic a:Lcom/arist/activity/MainActivity;

.field private final synthetic b:Lcom/ijoysoft/appwall/AppWallView;


# direct methods
.method constructor <init>(Lcom/arist/activity/MainActivity;Lcom/ijoysoft/appwall/AppWallView;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/t;->a:Lcom/arist/activity/MainActivity;

    iput-object p2, p0, Lcom/arist/activity/t;->b:Lcom/ijoysoft/appwall/AppWallView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/t;->b:Lcom/ijoysoft/appwall/AppWallView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/activity/t;->b:Lcom/ijoysoft/appwall/AppWallView;

    invoke-virtual {v0, p1}, Lcom/ijoysoft/appwall/AppWallView;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
