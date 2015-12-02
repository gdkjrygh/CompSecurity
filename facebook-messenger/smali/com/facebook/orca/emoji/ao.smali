.class public Lcom/facebook/orca/emoji/ao;
.super Ljava/lang/Object;
.source "TabbedPageView.java"


# instance fields
.field final a:Ljava/lang/Integer;

.field final b:Landroid/net/Uri;

.field final c:Ljava/lang/Integer;

.field final d:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/facebook/orca/emoji/ao;->a:Ljava/lang/Integer;

    .line 54
    iput-object p2, p0, Lcom/facebook/orca/emoji/ao;->b:Landroid/net/Uri;

    .line 55
    iput-object p3, p0, Lcom/facebook/orca/emoji/ao;->c:Ljava/lang/Integer;

    .line 56
    iput-object p4, p0, Lcom/facebook/orca/emoji/ao;->d:Landroid/view/View$OnClickListener;

    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, v0, v0, p2}, Lcom/facebook/orca/emoji/ao;-><init>(Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V

    .line 46
    return-void
.end method
