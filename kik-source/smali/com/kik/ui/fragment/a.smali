.class final Lcom/kik/ui/fragment/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/ui/fragment/FragmentBase;


# direct methods
.method constructor <init>(Lcom/kik/ui/fragment/FragmentBase;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/kik/ui/fragment/a;->a:Lcom/kik/ui/fragment/FragmentBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/kik/ui/fragment/a;->a:Lcom/kik/ui/fragment/FragmentBase;

    invoke-virtual {v0}, Lcom/kik/ui/fragment/FragmentBase;->v()Z

    .line 109
    return-void
.end method
