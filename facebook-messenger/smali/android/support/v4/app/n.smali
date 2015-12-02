.class public Landroid/support/v4/app/n;
.super Landroid/support/v4/app/p;
.source "FragmentActivityHost.java"


# instance fields
.field private final a:Landroid/support/v4/app/i;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/i;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Landroid/support/v4/app/p;-><init>()V

    .line 26
    iput-object p1, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    .line 27
    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    return-object v0
.end method

.method a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/i;->a(Ljava/lang/String;ZZ)Landroid/support/v4/app/ai;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/i;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/i;->a(Landroid/support/v4/app/Fragment;)V

    .line 72
    return-void
.end method

.method a(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/i;->a(Landroid/support/v4/app/Fragment;Landroid/content/Intent;I)V

    .line 117
    return-void
.end method

.method a(Landroid/support/v4/app/q;)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/i;->a(Landroid/support/v4/app/q;)V

    .line 87
    return-void
.end method

.method a(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/i;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 112
    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/i;->a(Ljava/lang/String;)V

    .line 92
    return-void
.end method

.method a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/app/i;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 122
    return-void
.end method

.method public b()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    iget-object v0, v0, Landroid/support/v4/app/i;->a:Landroid/os/Handler;

    return-object v0
.end method

.method public c()Landroid/view/Window;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->getWindow()Landroid/view/Window;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->isFinishing()Z

    move-result v0

    return v0
.end method

.method g()Landroid/support/v4/app/s;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    iget-object v0, v0, Landroid/support/v4/app/i;->b:Landroid/support/v4/app/s;

    return-object v0
.end method

.method h()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    iget-boolean v0, v0, Landroid/support/v4/app/i;->i:Z

    return v0
.end method

.method i()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->b_()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method

.method j()V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Landroid/support/v4/app/n;->a:Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->d()V

    .line 107
    return-void
.end method
