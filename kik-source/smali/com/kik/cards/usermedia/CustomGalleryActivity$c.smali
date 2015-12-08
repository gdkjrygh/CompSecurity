.class final Lcom/kik/cards/usermedia/CustomGalleryActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cards/usermedia/CustomGalleryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/CustomGalleryActivity;


# direct methods
.method private constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/kik/cards/usermedia/CustomGalleryActivity$c;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;B)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1}, Lcom/kik/cards/usermedia/CustomGalleryActivity$c;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 71
    check-cast p1, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;

    check-cast p2, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;

    invoke-virtual {p1}, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->a()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2}, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v0

    return v0
.end method
