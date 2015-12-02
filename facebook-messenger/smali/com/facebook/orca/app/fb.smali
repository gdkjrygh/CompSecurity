.class Lcom/facebook/orca/app/fb;
.super Ljava/lang/Object;
.source "MessengerApplicationImpl.java"

# interfaces
.implements Landroid/util/Printer;


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/fa;


# direct methods
.method constructor <init>(Lcom/facebook/orca/app/fa;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/orca/app/fb;->a:Lcom/facebook/orca/app/fa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public println(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    invoke-static {p1}, Lcom/facebook/debug/d/e;->b(Ljava/lang/String;)V

    .line 82
    :cond_0
    return-void
.end method
