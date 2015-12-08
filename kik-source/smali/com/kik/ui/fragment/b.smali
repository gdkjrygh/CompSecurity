.class final Lcom/kik/ui/fragment/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/ui/fragment/FragmentBase;


# direct methods
.method constructor <init>(Lcom/kik/ui/fragment/FragmentBase;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/kik/ui/fragment/b;->a:Lcom/kik/ui/fragment/FragmentBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lcom/kik/ui/fragment/b;->a:Lcom/kik/ui/fragment/FragmentBase;

    invoke-static {v0}, Lcom/kik/ui/fragment/FragmentBase;->a(Lcom/kik/ui/fragment/FragmentBase;)V

    .line 169
    return-void
.end method
