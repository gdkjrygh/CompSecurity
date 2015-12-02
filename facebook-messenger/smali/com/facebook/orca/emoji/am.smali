.class public Lcom/facebook/orca/emoji/am;
.super Ljava/lang/Object;
.source "TabbedPageView.java"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/Integer;

.field final c:Landroid/net/Uri;

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Landroid/net/Uri;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Landroid/net/Uri;",
            "Ljava/util/List",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/facebook/orca/emoji/am;->a:Ljava/lang/String;

    .line 79
    iput-object p2, p0, Lcom/facebook/orca/emoji/am;->b:Ljava/lang/Integer;

    .line 80
    iput-object p3, p0, Lcom/facebook/orca/emoji/am;->c:Landroid/net/Uri;

    .line 81
    iput-object p4, p0, Lcom/facebook/orca/emoji/am;->d:Ljava/util/List;

    .line 82
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 70
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/facebook/orca/emoji/am;-><init>(Ljava/lang/String;Ljava/lang/Integer;Landroid/net/Uri;Ljava/util/List;)V

    .line 71
    return-void
.end method
