.class public final Lcom/google/android/gms/maps/model/MarkerOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/maps/model/MarkerOptionsCreator;


# instance fields
.field private final iM:I

.field private mAlpha:F

.field private qA:Lcom/google/android/gms/maps/model/LatLng;

.field private qB:Ljava/lang/String;

.field private qC:Ljava/lang/String;

.field private qD:Lcom/google/android/gms/maps/model/BitmapDescriptor;

.field private qE:Z

.field private qF:Z

.field private qG:F

.field private qH:F

.field private qI:F

.field private ql:Z

.field private qt:F

.field private qu:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptionsCreator;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptionsCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/maps/model/MarkerOptions;->CREATOR:Lcom/google/android/gms/maps/model/MarkerOptionsCreator;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    const/4 v4, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qt:F

    iput v3, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qu:F

    iput-boolean v4, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ql:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qF:Z

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qG:F

    iput v2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qH:F

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qI:F

    iput v3, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F

    iput v4, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->iM:I

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;FFZZZFFFF)V
    .locals 3
    .param p1, "versionCode"    # I
    .param p2, "position"    # Lcom/google/android/gms/maps/model/LatLng;
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "snippet"    # Ljava/lang/String;
    .param p5, "wrappedIcon"    # Landroid/os/IBinder;
    .param p6, "anchorU"    # F
    .param p7, "anchorV"    # F
    .param p8, "draggable"    # Z
    .param p9, "visible"    # Z
    .param p10, "flat"    # Z
    .param p11, "rotation"    # F
    .param p12, "infoWindowAnchorU"    # F
    .param p13, "infoWindowAnchorV"    # F
    .param p14, "alpha"    # F

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qt:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qu:F

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ql:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qF:Z

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qG:F

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qH:F

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qI:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F

    iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->iM:I

    iput-object p2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qA:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p3, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qB:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qC:Ljava/lang/String;

    if-nez p5, :cond_0

    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qD:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    iput p6, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qt:F

    iput p7, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qu:F

    iput-boolean p8, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qE:Z

    iput-boolean p9, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ql:Z

    iput-boolean p10, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qF:Z

    iput p11, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qG:F

    iput p12, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qH:F

    move/from16 v0, p13

    iput v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qI:F

    move/from16 v0, p14

    iput v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F

    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/maps/model/BitmapDescriptor;

    invoke-static {p5}, Lcom/google/android/gms/dynamic/b$a;->z(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/b;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/b;)V

    goto :goto_0
.end method


# virtual methods
.method public alpha(F)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "alpha"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F

    return-object p0
.end method

.method public anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "u"    # F
    .param p2, "v"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qt:F

    iput p2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qu:F

    return-object p0
.end method

.method cN()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qD:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qD:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptor;->cs()Lcom/google/android/gms/dynamic/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/dynamic/b;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public draggable(Z)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "draggable"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qE:Z

    return-object p0
.end method

.method public flat(Z)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "flat"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qF:Z

    return-object p0
.end method

.method public getAlpha()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F

    return v0
.end method

.method public getAnchorU()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qt:F

    return v0
.end method

.method public getAnchorV()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qu:F

    return v0
.end method

.method public getIcon()Lcom/google/android/gms/maps/model/BitmapDescriptor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qD:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    return-object v0
.end method

.method public getInfoWindowAnchorU()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qH:F

    return v0
.end method

.method public getInfoWindowAnchorV()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qI:F

    return v0
.end method

.method public getPosition()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qA:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public getRotation()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qG:F

    return v0
.end method

.method public getSnippet()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qC:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qB:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->iM:I

    return v0
.end method

.method public icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "icon"    # Lcom/google/android/gms/maps/model/BitmapDescriptor;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qD:Lcom/google/android/gms/maps/model/BitmapDescriptor;

    return-object p0
.end method

.method public infoWindowAnchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "u"    # F
    .param p2, "v"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qH:F

    iput p2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qI:F

    return-object p0
.end method

.method public isDraggable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qE:Z

    return v0
.end method

.method public isFlat()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qF:Z

    return v0
.end method

.method public isVisible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ql:Z

    return v0
.end method

.method public position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "position"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qA:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public rotation(F)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "rotation"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qG:F

    return-object p0
.end method

.method public snippet(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "snippet"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qC:Ljava/lang/String;

    return-object p0
.end method

.method public title(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->qB:Ljava/lang/String;

    return-object p0
.end method

.method public visible(Z)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 0
    .param p1, "visible"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ql:Z

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {}, Lcom/google/android/gms/maps/internal/r;->cK()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/f;->a(Lcom/google/android/gms/maps/model/MarkerOptions;Landroid/os/Parcel;I)V

    :goto_0
    return-void

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/MarkerOptionsCreator;->a(Lcom/google/android/gms/maps/model/MarkerOptions;Landroid/os/Parcel;I)V

    goto :goto_0
.end method
