.class Lcom/facebook/orca/emoji/ak;
.super Ljava/lang/Object;
.source "TabbedPageView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/facebook/orca/emoji/TabbedPageView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/TabbedPageView;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lcom/facebook/orca/emoji/ak;->c:Lcom/facebook/orca/emoji/TabbedPageView;

    iput-object p2, p0, Lcom/facebook/orca/emoji/ak;->a:Ljava/lang/String;

    iput p3, p0, Lcom/facebook/orca/emoji/ak;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 244
    iget-object v0, p0, Lcom/facebook/orca/emoji/ak;->c:Lcom/facebook/orca/emoji/TabbedPageView;

    iget-object v1, p0, Lcom/facebook/orca/emoji/ak;->a:Ljava/lang/String;

    iget v2, p0, Lcom/facebook/orca/emoji/ak;->b:I

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/TabbedPageView;Ljava/lang/String;I)V

    .line 245
    return-void
.end method
