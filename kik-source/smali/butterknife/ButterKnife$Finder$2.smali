.class final enum Lbutterknife/ButterKnife$Finder$2;
.super Lbutterknife/ButterKnife$Finder;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lbutterknife/ButterKnife$Finder;-><init>(Ljava/lang/String;ILbutterknife/ButterKnife$1;)V

    return-void
.end method


# virtual methods
.method public final findById(Ljava/lang/Object;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 77
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
